package leetcode;

import org.junit.jupiter.api.Test;

public class P1189Test {

    @Test
    void test1() {
        String text = "balloonxxxballoonxxxballoon";
        int expected = 3;
        P1189 solution = new P1189();
        int actual = solution.maxNumberOfBalloons(text);
        assert expected == actual;
    }
}
