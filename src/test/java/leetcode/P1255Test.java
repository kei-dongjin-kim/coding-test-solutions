package leetcode;

import org.junit.jupiter.api.Test;

public class P1255Test {

    @Test
    void test1() {
        String[] words = {"dog","cat","dad","good"};
        char[] letters = {'a','a','c','d','d','d','g','o','o'};
        int[] score = {1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0};
        int expected = 23;
        assert new P1255().maxScoreWords(words, letters, score) == expected;
    }
}
