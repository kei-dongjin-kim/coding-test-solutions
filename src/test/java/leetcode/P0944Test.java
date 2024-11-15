package leetcode;

import org.junit.jupiter.api.Test;

public class P0944Test {
  
  @Test
  void test1() {
    String[] strs = {"abz","def","ghi"};
    int expected = 1;
    P0944 solution = new P0944();
    int actual = solution.minDeletionSize(strs);
    assert expected == actual;
  }
}
