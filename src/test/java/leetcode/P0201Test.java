package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0201Test {

    @Test
    @DisplayName("left = 5, right = 7")
    void rangeBitwiseAnd_Test1() {
        int left = 5;
        int right = 7;
        int expected = 4;
        assert new P0201().rangeBitwiseAnd(left, right) == expected;
    }

    @Test
    @DisplayName("left = 0, right = 0")
    void rangeBitwiseAnd_Test2() {
        int left = 0;
        int right = 0;
        int expected = 0;
        assert new P0201().rangeBitwiseAnd(left, right) == expected;
    }

    @Test
    @DisplayName("left = 1, right = 2147483647")
    void rangeBitwiseAnd_Test3() {
        int left = 1;
        int right = 2147483647;
        int expected = 0;
        assert new P0201().rangeBitwiseAnd(left, right) == expected;
    }

    @Test
    @DisplayName("left = 0, right = 1")
    void rangeBitwiseAnd_Test4() {
        int left = 0;
        int right = 1;
        int expected = 0;
        assert new P0201().rangeBitwiseAnd(left, right) == expected;
    }

    @Test
    @DisplayName("left = 600000000, right = 2147483645")
    void rangeBitwiseAnd_Test5() {
        int left = 600000000;
        int right = 2147483645;
        int expected = 0;
        assert new P0201().rangeBitwiseAnd(left, right) == expected;
    }

    @Test
    @DisplayName("left = 1, right = 2")
    void rangeBitwiseAnd_Test6() {
        int left = 1;
        int right = 2;
        int expected = 0;
        int actual = new P0201().rangeBitwiseAnd(left, right);
        assert actual == expected;
    }

    @Test
    @DisplayName("left = 2147483646, right = 2147483647")
    void rangeBitwiseAnd_Test7() {
        int left = 2147483646;
        int right = 2147483647;
        int expected = 2147483646;
        int actual = new P0201().rangeBitwiseAnd(left, right);
        System.out.println("test: " + actual + " == " + expected);
        assert actual == expected;
    }
}
