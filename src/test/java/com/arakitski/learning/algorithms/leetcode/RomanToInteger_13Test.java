package com.arakitski.learning.algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RomanToInteger_13Test {

    private RomanToInteger_13 service;

    @BeforeEach
    void prepare() {
        service = new RomanToInteger_13();
    }

    @Test
    void testRomanToInteger_1(){
        assertThat(service.romanToInt("III")).isEqualTo(3);
    }

    @Test
    void testRomanToInteger_2(){
        assertThat(service.romanToInt("LVIII")).isEqualTo(58);
    }

    @Test
    void testRomanToInteger_3(){
        assertThat(service.romanToInt("MCMXCIV")).isEqualTo(1994);
    }
}