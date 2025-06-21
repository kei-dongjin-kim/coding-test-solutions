package leetcode;

import org.junit.jupiter.api.Test;

public class P2490Test {

    @Test
    void test1() {
        String sentence = "abc cde efg ghi ijka";
        boolean expected = true;
        P2490 solution = new P2490();
        boolean actual = solution.isCircularSentence(sentence);
        assert expected == actual;
    }

    @Test
    void test2() {
        String sentence = "abc cde efg ghi ijk";
        boolean expected = false;
        P2490 solution = new P2490();
        boolean actual = solution.isCircularSentence(sentence);
        assert expected == actual;
    }
}
