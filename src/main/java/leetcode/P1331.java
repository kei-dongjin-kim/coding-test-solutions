package leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class P1331 {
  public int[] arrayRankTransform(int[] arr) {
    int[] cloned = arr.clone();
    Arrays.sort(cloned);
    Map<Integer, Integer> map = new HashMap<>();
    int rank = 1;
    for (Integer i : cloned) {
      if (!map.containsKey(i)) {
        map.put(i, rank++);
      }
    }
    int len = arr.length;
    int[] result = new int[len];
    for (int i=0 ; i<len ; i++) {
      result[i] = map.get(arr[i]);
    }
    return result;
  }
}
