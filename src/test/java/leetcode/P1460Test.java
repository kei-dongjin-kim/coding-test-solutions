package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1460Test {

    @Test
    @DisplayName("target = [1,2,3], arr = [2,1,3]")
    void test1() {
        int[] target = {1, 2, 3};
        int[] arr = {2, 1, 3};
        assert new P1460().canBeEqual(target, arr);
    }
}
