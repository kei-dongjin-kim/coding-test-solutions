package leetcode;

import org.junit.jupiter.api.Test;

public class P0929Test {

    @Test
    void test1() {
        String[] emails = new String[] {"abc@email.com", "abc.xyz@email.com", "abc+def@email.com"};
        int expected = 2;
        P0929 solution = new P0929();
        int actual = solution.numUniqueEmails(emails);
        assert expected == actual;
    }
}
