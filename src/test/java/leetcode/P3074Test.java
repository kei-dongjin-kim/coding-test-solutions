package leetcode;

import org.junit.jupiter.api.Test;

public class P3074Test {
  
  @Test
  void test1() {
    int[] apple = {1, 2, 3};
    int[] capacity = {1, 2, 3, 6};
    int expected = 1;
    P3074 solution = new P3074();
    int actual = solution.minimumBoxes(apple, capacity);
    assert expected == actual;
  }
}
