package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1331Test {
  
  @Test
  @DisplayName("arr = [40, 10, 20, 20, 30]")
  void test1() {
    int[] arr = {40, 10, 20, 20, 30};
    int[] expected = {4, 1, 2, 2, 3};
    int[] actual = new P1331().arrayRankTransform(arr);
    for (int i = 0; i < arr.length; ++i) {
      assert expected[i] == actual[i];
    }
  }
}
