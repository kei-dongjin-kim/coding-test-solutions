package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0441Test {

  @Test
  @DisplayName("n = 7")
  void test1() {
    int n = 7;
    int expected = 3;
    int actual = new P0441().arrangeCoins(n);
    assert expected == actual;
  }
}