package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P0922Test {

    @Test
    @DisplayName("nums = [4,2,5,7]")
    void sortArrayByParityII_Test1() {
        int[] nums ={4, 2, 5, 7};
        P0922 solution = new P0922();
        int[] actual = solution.sortArrayByParityII(nums);
        for (int i=0 ; i<actual.length ; i++) {
            if (i%2 == 0) {
                assert actual[i] % 2 == 0;
            } else {
                assert actual[i] % 2 == 1;
            }
        }
        Arrays.sort(nums);
        Arrays.sort(actual);
        assert Arrays.equals(nums, actual);
    }
}
