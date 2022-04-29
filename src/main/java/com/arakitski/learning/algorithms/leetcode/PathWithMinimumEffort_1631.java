package com.arakitski.learning.algorithms.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class PathWithMinimumEffort_1631 {

    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    // Copy-pasted solution with Djakarta algorithm
    public int minimumEffortPath(int[][] heights) {
        int len = heights.length;
        int[][] differenceMatrix = new int[len][len];
        for (int[] eachRow : differenceMatrix) {
            Arrays.fill(eachRow, Integer.MAX_VALUE);
        }
        differenceMatrix[0][0] = 0;
        PriorityQueue<Cell> queue = new PriorityQueue<>(Comparator.comparing(a -> a.difference));
        boolean[][] visited = new boolean[len][len];
        queue.add(new Cell(0, 0, differenceMatrix[0][0]));

        while (!queue.isEmpty()) {
            Cell curr = queue.poll();
            visited[curr.x][curr.y] = true;
            if (curr.x == len - 1 && curr.y == len - 1){
                return curr.difference;
            }
            for (int[] direction : directions) {
                int ax = curr.x + direction[0];
                int ay = curr.y + direction[1];
                if (isValidCell(ax, ay, len) && !visited[ax][ay]) {
                    int currentDifference = Math.abs(heights[ax][ay] - heights[curr.x][curr.y]);
                    int maxDifference = Math.max(currentDifference, differenceMatrix[curr.x][curr.y]);
                    if (differenceMatrix[ax][ay] > maxDifference) {
                        differenceMatrix[ax][ay] = maxDifference;
                        queue.add(new Cell(ax, ay, maxDifference));
                    }
                }
            }
        }
        return differenceMatrix[len - 1][len - 1];
    }

    boolean isValidCell(int x, int y, int len) {
        return x >= 0 && x <= len - 1 && y >= 0 && y <= len - 1;
    }

    static class Cell {
        int x;
        int y;
        Integer difference;

        Cell(int x, int y, Integer difference) {
            this.x = x;
            this.y = y;
            this.difference = difference;
        }
    }
}