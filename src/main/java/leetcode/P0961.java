package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P0961 {
  public int repeatedNTimes(int[] nums) {
    int halflen = nums.length / 2;
    Map<Integer, Integer> map = new HashMap<>();
    for (int n : nums) {
      map.merge(n, 1, Integer::sum);
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() == halflen) {
        return entry.getKey();
      }
    }
    return -1;
  }
}
