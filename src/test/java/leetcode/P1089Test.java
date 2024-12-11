package leetcode;

import org.junit.jupiter.api.Test;

public class P1089Test {

  @Test
  void test1() {
    int[] arr = {1, 2, 0, 3, 0, 4, 5};
    int[] expected = {1, 2, 0, 0, 3, 0, 0};
    P1089 solution = new P1089();
    solution.duplicateZeros(arr);
    for (int i = 0; i < arr.length; i++) {
      assert arr[i] == expected[i];
    }
  }
}
