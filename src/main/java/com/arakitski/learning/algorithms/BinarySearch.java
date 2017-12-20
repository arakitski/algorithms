package com.arakitski.learning.algorithms;

public class BinarySearch {

    public static int getElementIndex(int[] input, int searchElement) {
        int low = 0;
        int height = input.length - 1;
        while (low <= height) {
            int middleIndex = (height + low) / 2;
            int middleValue = input[middleIndex];
            if (middleValue > searchElement) {
                height = middleIndex - 1;
            } else if (middleValue < searchElement) {
                low = middleIndex + 1;
            } else {
                return middleIndex;
            }
        }
        return -1;
    }
}
