package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1750Test {

    @Test
    @DisplayName("ca")
    void minimumLength_Test1() {
        P1750 solution = new P1750();
        assert 2 == solution.minimumLength("ca");
    }

    @Test
    @DisplayName("cabaabac")
    void minimumLength_Test2() {
        P1750 solution = new P1750();
        assert 0 == solution.minimumLength("cabaabac");
    }

    @Test
    @DisplayName("aabccabba")
    void minimumLength_Test3() {
        P1750 solution = new P1750();
        assert 3 == solution.minimumLength("aabccabba");
    }

    @Test
    @DisplayName("a")
    void minimumLength_Test4() {
        P1750 solution = new P1750();
        assert 1 == solution.minimumLength("a");
    }

    @Test
    @DisplayName("abbbbbbbbbbbbbbbbbbba")
    void minimumLength_Test5() {
        P1750 solution = new P1750();
        assert 0 == solution.minimumLength("abbbbbbbbbbbbbbbbbbba");
    }

    @Test
    @DisplayName("bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbbbbbbbbbbbbbccbcbcbccbbabbb")
    void minimumLength_Test6() {
        P1750 solution = new P1750();
        assert 1 == solution.minimumLength("bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbbbbbbbbbbbbbccbcbcbccbbabbb");
    }
}
