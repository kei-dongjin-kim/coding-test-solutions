package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0857Test {

    @Test
    @DisplayName("quality = [10,20,5], wage = [70,50,30], k = 2")
    void test1() {
        int[] quality = {10, 20, 5};
        int[] wage = {70, 50, 30};
        int k = 2;
        double expected = 105.0;
        double actual = new P0857().mincostToHireWorkers(quality, wage, k);
        assert expected == actual;
    }
}
