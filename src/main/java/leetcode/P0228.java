package leetcode;

import java.util.List;
import java.util.ArrayList;

public class P0228 {
  public List<String> summaryRanges(int[] nums) {
    List<String> list = new ArrayList<>();
    int len = nums.length;
    if (len == 0) {
      return list;
    }
    if (len == 1) {
      list.add(String.valueOf(nums[0]));
      return list;
    }

    int start = nums[0];
    int previous = nums[0];
    for (int i = 1 ; i < len ; i++ ) {
      if (previous + 1 != nums[i]) {
        if (start == previous) {
          list.add(String.valueOf(start));
        } else {
          list.add(start + "->" + previous);
        }
        start = nums[i];
      }
      previous = nums[i];

      // for the last time
      if (i == len - 1) {
        if (start == previous) {
          list.add(String.valueOf(start));
        } else {
          list.add(start + "->" + previous);
        }
      }
    }
    return list;
  }
}
