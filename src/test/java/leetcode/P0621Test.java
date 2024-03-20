package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0621Test {

    @Test
    @DisplayName("tasks = [A,A,A,B,B,B], n = 2")
    void leastInterval_Test1() {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        int expected = 8;
        int actual = new P0621().leastInterval(tasks, n);
        assert expected == actual;
    }

}
