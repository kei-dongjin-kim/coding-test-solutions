package leetcode;

import org.junit.jupiter.api.Test;

public class P2053Test {

    @Test
    void test1() {
        String[] arr = new String[] {"a", "b", "c", "d", "e", "f"};
        int k = 3;
        String expected = "c";
        P2053 solution = new P2053();
        String actual = solution.kthDistinct(arr, k);
        assert expected.equals(actual);
    }
}
