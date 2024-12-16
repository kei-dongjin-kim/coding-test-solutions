package leetcode;

import org.junit.jupiter.api.Test;

public class P3024Test {
  
  @Test
  void test1() {
    int[] nums = {5, 5, 100};
    String expected = "none";
    P3024 solution = new P3024();
    String actual = solution.triangleType(nums);
    assert expected.equals(actual);
  }
}
