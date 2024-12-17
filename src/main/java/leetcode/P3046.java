package leetcode;

public class P3046 {
  public boolean isPossibleToSplit(int[] nums) {
    int[] map = new int[101];
    for (int n : nums) {
      if (map[n] == 2) {
        return false;
      } else {
        map[n]++;
      }
    }
    return true;
  }
}
