package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1442Test {

    @Test
    @DisplayName("arr = [2,3,1,6,7]")
    void test1() {
        int[] arr = {2,3,1,6,7};
        P1442 p1442 = new P1442();
        assert p1442.countTriplets(arr) == 4;
    }
}
