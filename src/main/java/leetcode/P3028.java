package leetcode;

public class P3028 {
  public int returnToBoundaryCount(int[] nums) {
    int count = 0;
    int curr = 0;
    for (int n : nums) {
      curr += n;
      if (curr == 0) {
        count++;
      }
    }
    return count;
  }
}
