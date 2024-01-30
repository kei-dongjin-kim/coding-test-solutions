package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P0232Test {

    @Test
    @DisplayName("[MyQueue, push, push, peek, pop, empty], [[], [1], [2], [], [], []]")
    void test1() {
        P0232 queue = new P0232();
        queue.push(1);
        int[] actual1 = queue.print();
        assert Arrays.equals(actual1, new int[]{1});
        queue.push(2);
        int[] actual2 = queue.print();
        assert Arrays.equals(actual2, new int[]{1, 2});
        int actual3 = queue.peek();
        assert actual3 == 1;
        queue.pop();
        int[] actual4 = queue.print();
        assert Arrays.equals(actual4, new int[]{2});
        boolean actual5 = queue.empty();
        assert !actual5;
    }
}
