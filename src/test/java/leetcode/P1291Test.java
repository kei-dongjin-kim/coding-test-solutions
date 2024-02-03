package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class P1291Test {

    @Test
    @DisplayName("low = 100, high = 300")
    void sequentialDigits_Test1() {
        P1291 solution = new P1291();
        List<Integer> actual = solution.sequentialDigits(100, 300);
        assert actual.equals(Arrays.asList(123, 234));;
    }

    @Test
    @DisplayName("low = 1000, high = 13000")
    void sequentialDigits_Test2() {
        P1291 solution = new P1291();
        List<Integer> actual = solution.sequentialDigits(1000, 13000);
        assert actual.equals(Arrays.asList(1234, 2345, 3456, 4567, 5678, 6789, 12345));
    }
}
