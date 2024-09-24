package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0258Test {
  
  @Test
  @DisplayName("num = 111")
  void test1() {
    int expected = 3;
    int actual = new P0258().addDigits(111);
    assert expected == actual;
  }
}
