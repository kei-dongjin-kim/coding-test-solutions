package leetcode;

import org.junit.jupiter.api.Test;

public class P1491Test {

    @Test
    void test1() {
        int[] salary = new int[] {1, 3, 3, 4, 9};
        double expected = 3.33333;
        P1491 solution = new P1491();
        double actual = solution.average(salary);
        System.out.println(actual);
        assert expected == actual;
    }
}
