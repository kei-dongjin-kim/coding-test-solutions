package leetcode;

import java.util.Set;
import java.util.HashSet;

public class P0217 {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int n : nums) {
      if (!set.add(n)) {
        return true;
      }
    }
    return false;
  }
}
