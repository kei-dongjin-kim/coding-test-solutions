package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0150Test {

    @Test
    @DisplayName("[\"2\",\"1\",\"+\",\"3\",\"*\"]")
    void valRPN_Test1() {
        String[] tokens = {"2", "1", "+", "3", "*"};
        P0150 solution = new P0150();
        int expected = 9;
        int actual = solution.evalRPN(tokens);
        assert(expected == actual);
    }

    @Test
    @DisplayName("[\"4\",\"13\",\"5\",\"/\",\"+\"]")
    void valRPN_Test2() {
        String[] tokens = {"4", "13", "5", "/", "+"};
        P0150 solution = new P0150();
        int expected = 6;
        int actual = solution.evalRPN(tokens);
        assert(expected == actual);
    }

    @Test
    @DisplayName("[\"10\",\"6\",\"9\",\"3\",\"+\",\"-11\",\"*\",\"/\",\"*\",\"17\",\"+\",\"5\",\"+\"]")
    void valRPN_Test3() {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        P0150 solution = new P0150();
        int expected = 22;
        int actual = solution.evalRPN(tokens);
        assert(expected == actual);
    }
}
