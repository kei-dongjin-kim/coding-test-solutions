package leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class P0697 {
  public int findShortestSubArray(int[] nums) {
    int len = nums.length;
    Map<Integer, Integer> left = new HashMap<>();
    Map<Integer, Integer> right = new HashMap<>();
    Map<Integer, Integer> freq = new HashMap<>();
    for (int i=0 ; i<len ; i++) {
      int curr = nums[i];
      if (left.get(curr) == null) {
        left.put(curr, i);
      }
      right.put(curr, i);
      freq.merge(curr, 1, Integer::sum);
    }
    int result = len;
    int maxFreq = Collections.max(freq.values());
    for (int i : freq.keySet()) {
      if (freq.get(i) == maxFreq) {
        result = Math.min(result, right.get(i) - left.get(i) + 1);
      }
    }
    return result;
  }
}
