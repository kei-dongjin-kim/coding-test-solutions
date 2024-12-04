package leetcode;

import org.junit.jupiter.api.Test;

public class P0495Test {

  @Test
  void test1() {
    int[] timeSeries = {1, 5, 7};
    int duration = 4;
    int expected = 10;
    P0495 solution = new P0495();
    int actual = solution.findPoisonedDuration(timeSeries, duration);
    assert expected == actual;
  }
}
