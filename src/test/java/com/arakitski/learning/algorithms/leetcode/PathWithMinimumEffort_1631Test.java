package com.arakitski.learning.algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PathWithMinimumEffort_1631Test {
    private PathWithMinimumEffort_1631 service;

    @BeforeEach
    void prepare() {
        service = new PathWithMinimumEffort_1631();
    }

    @Test
    void testWithMinimumEffort_1() {
        assertThat(service.minimumEffortPath(new int[][]{
                {1, 2, 2},
                {3, 8, 2},
                {5, 3, 5}
        })).isEqualTo(2);
    }

    @Test
    void testWithMinimumEffort_2() {
        assertThat(service.minimumEffortPath(new int[][]{
                {1, 2, 3},
                {3, 8, 4},
                {5, 3, 5}
        })).isEqualTo(1);
    }

    @Test
    void testWithMinimumEffort_3() {
        assertThat(service.minimumEffortPath(new int[][]{
                {1, 2, 1, 1, 1},
                {1, 2, 1, 2, 1},
                {1, 2, 1, 2, 1},
                {1, 2, 1, 2, 1},
                {1, 1, 1, 2, 1}
        })).isEqualTo(0);
    }
}