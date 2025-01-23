package leetcode;

import org.junit.jupiter.api.Test;

public class P1108Test {

    @Test
    void test1() {
        String address = "7.7.7.7";
        String expected = "7[.]7[.]7[.]7";
        P1108 solution = new P1108();
        String actual = solution.defangIPaddr(address);
        assert expected.equals(actual);
    }
}
