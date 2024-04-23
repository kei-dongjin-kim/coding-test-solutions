package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0753Test {

    @Test
    @DisplayName("deadends = [0201,0101,0102,1212,2002], target = 0202")
    void test1() {
        String[] deadends = {"0201", "0101", "0102", "1212", "2002"};
        String target = "0202";
        int expected = 6;
        assert expected == new P0753().openLock(deadends, target);
    }
}
