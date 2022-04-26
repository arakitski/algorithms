package com.arakitski.learning.algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromeNumber9Test {

    private PalindromeNumber9 service;

    @BeforeEach
    void prepare() {
        service = new PalindromeNumber9();
    }

    @Test
    void shouldFindPalindrome_true() {
        assertThat(service.isPalindrome(121)).isTrue();
    }

    @Test
    void shouldOddPalindrome_true() {
        assertThat(service.isPalindrome(1221)).isTrue();
    }

    @Test
    void shouldNegativePalindrome_false() {
        assertThat(service.isPalindrome(-121)).isFalse();
    }

    @Test
    void shouldIsPalindrome_false() {
        assertThat(service.isPalindrome(123)).isFalse();
    }

    @Test
    void shouldOnePalindrome_true() {
        assertThat(service.isPalindrome(1)).isTrue();
    }
}