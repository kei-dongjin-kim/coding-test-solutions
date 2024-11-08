package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P0830 {
  public List<List<Integer>> largeGroupPositions(String s) {
    int len = s.length();
    List<List<Integer>> list = new ArrayList<>();
    if (len < 3) {
      return list;
    }
    int left = -1;
    char previous = s.charAt(0);
    for (int i=1 ; i<len ; i++) {
      if (left == -1) {
        if (previous == s.charAt(i)) {
          left = i - 1;
        }
      } else {
        if (previous != s.charAt(i)) {
          if (i - left >= 3) {
            list.add(Arrays.asList(left, i - 1));
          }
          left = -1;
        }
      }
      previous = s.charAt(i);
    }
    if (left != -1) {
      if (len - left >= 3) {
        list.add(Arrays.asList(left, len - 1));
      }
    }
    return list;
  }
}
