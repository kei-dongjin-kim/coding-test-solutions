package leetcode;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

public class P0228Test {
  
  @Test
  void test1() {
    int[] nums = {1, 2, 3, 4, 5, 7, 8, 10};
    P0228 solution = new P0228();
    List<String> expected = Arrays.asList("1->5", "7->8", "10");
    List<String> actual = solution.summaryRanges(nums);
    for (int i = 0; i < expected.size(); ++i) {
      assert (expected.get(i).equals(actual.get(i)));
    }
  }
}
