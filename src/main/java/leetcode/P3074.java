package leetcode;

import java.util.Arrays;

public class P3074 {
  public int minimumBoxes(int[] apple, int[] capacity) {
    int result = 0;
    int sum = 0;
    for (int a : apple) {
      sum += a;
    }
    Arrays.sort(capacity);
    for (int i = capacity.length - 1; i >= 0; i--) {
      sum -= capacity[i];
      result++;
      if (sum <= 0) {
        break;
      }
    }
    return result;
  }
}
