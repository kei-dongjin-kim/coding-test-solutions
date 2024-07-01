package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1550Test {

    @Test
    @DisplayName("arr = [1,2,3,4,5,6,7,8,9]")
    void test1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean actual = new P1550().threeConsecutiveOdds(arr);
        boolean expected = false;
        assert expected == actual;
    }

    @Test
    @DisplayName("arr = [1,3,5,6,7]")
    void test2() {
        int[] arr = {1, 3, 5, 6, 7};
        boolean actual = new P1550().threeConsecutiveOdds(arr);
        boolean expected = true;
        assert expected == actual;
    }
}
