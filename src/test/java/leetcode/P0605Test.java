package leetcode;

import org.junit.jupiter.api.Test;

public class P0605Test {
  
  @Test
  void test1() {
    int[] flowerbed = new int[] {1, 0, 0, 0, 0, 0, 1};
    int n = 2;
    P0605 solution = new P0605();
    assert solution.canPlaceFlowers(flowerbed, n);
  }
}
