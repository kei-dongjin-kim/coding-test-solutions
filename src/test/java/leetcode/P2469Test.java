package leetcode;

import org.junit.jupiter.api.Test;

public class P2469Test {

    @Test
    void test1() {
        double celsius = 1d;
        double[] expected = new double[] {274.15d, 33.8d};
        P2469 solution = new P2469();
        double[] actual = solution.convertTemperature(celsius);
        assert expected[0] == actual[0];
        assert expected[1] == actual[1];
    }
}
