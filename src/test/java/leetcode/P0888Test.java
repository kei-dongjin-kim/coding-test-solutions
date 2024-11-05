package leetcode;

import org.junit.jupiter.api.Test;

public class P0888Test {
  
  @Test
  void test1() {
    int[] aliceSizes = {1, 2, 3};
    int[] bobSizes = {2, 4, 5, 7};
    int[] expected = {1, 7};
    P0888 solution = new P0888();
    int[] actual = solution.fairCandySwap(aliceSizes, bobSizes);
    for (int i=0 ; i<expected.length ; i++) {
      assert expected[i] == actual[i];
    }
  }
}
