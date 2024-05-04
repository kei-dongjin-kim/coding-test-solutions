package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0881Test {

    @Test
    @DisplayName("people = [3,5,3,4], limit = 5")
    void test1() {
        int[] people = {3, 5, 3, 4};
        int limit = 5;
        int expected = 4;
        int actual = new P0881().numRescueBoats(people, limit);
        assert actual == expected;
    }
}
