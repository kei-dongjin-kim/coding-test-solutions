package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P1342Test {
    @Test
    @DisplayName("Test number of steps")
    public void testNumberOfSteps() {
        P1342 solution = new P1342();

        assertEquals(0, solution.numberOfSteps(0));
        assertEquals(1, solution.numberOfSteps(1));
        assertEquals(2, solution.numberOfSteps(2));
        assertEquals(3, solution.numberOfSteps(3));
        assertEquals(4, solution.numberOfSteps(8));
        assertEquals(6, solution.numberOfSteps(14));
        assertEquals(12, solution.numberOfSteps(123));
    }
}