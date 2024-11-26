package leetcode;

import org.junit.jupiter.api.Test;
import java.util.*;

public class P0448Test {
  
  @Test
  void test1() {
    int[] nums = {1,2,3,4,4,6,8,8,9};
    List<Integer> expected = Arrays.asList(5, 7);
    P0448 solution = new P0448();
    List<Integer> actual = solution.findDisappearedNumbers(nums);
    assert actual.equals(expected);
  }
}
