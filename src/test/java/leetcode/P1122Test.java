package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1122Test {

    @Test
    @DisplayName("arr1 = [21,22,1,2,3,4,5] arr2 = [1,2,3,4,5]")
    void test1() {
        int[] arr1 = {21,22,1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int[] expected = {1,2,3,4,5,21,22};
        int[] actual = new P1122().relativeSortArray(arr1, arr2);
        for (int i=0 ; i<expected.length ; i++) {
            assert expected[i] == actual[i];
        }
    }
}
