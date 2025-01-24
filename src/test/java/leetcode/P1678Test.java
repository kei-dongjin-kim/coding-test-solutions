package leetcode;

import org.junit.jupiter.api.Test;

public class P1678Test {

    @Test
    void test1() {
        String command = "G()()()(al)";
        String expected = "Goooal";
        P1678 solution = new P1678();
        String actual = solution.interpret(command);
        assert expected.equals(actual);
    }
}
