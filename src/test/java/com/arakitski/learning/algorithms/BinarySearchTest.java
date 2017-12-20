package com.arakitski.learning.algorithms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;

@RunWith(Parameterized.class)
public class BinarySearchTest {

    @Parameterized.Parameters
    public static Collection<ArrayForBinarySearch> data() {
        return List.of(
                new ArrayForBinarySearch(new int[]{0, 1, 4, 8, 9, 11, 13}, 4, 2),
                new ArrayForBinarySearch(new int[]{0, 1, 5, 7, 9, 11, 15, 16}, 11, 5),
                new ArrayForBinarySearch(new int[]{1, 5, 6, 8, 9}, 12214, -1)
        );
    }

    private static class ArrayForBinarySearch {
        private int[] inputArrays;
        private int element;
        private int expectedIndex;

        ArrayForBinarySearch(int[] inputArrays, int element, int expectedIndex) {
            this.inputArrays = inputArrays;
            this.element = element;
            this.expectedIndex = expectedIndex;
        }
    }

    @Parameterized.Parameter
    public ArrayForBinarySearch param;

    @Test
    public void getElementIndex() {
        assertThat(BinarySearch.getElementIndex(param.inputArrays, param.element))
                .isEqualTo(param.expectedIndex);
    }
}