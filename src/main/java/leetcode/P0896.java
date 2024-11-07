package leetcode;

public class P0896 {
  public boolean isMonotonic(int[] nums) {
    int len = nums.length;
    boolean increasing = nums[len - 1] - nums[0] >= 0;
    int previous = nums[0];
    for (int i=1 ; i<len ; i++) {
      if (increasing) {
        if (previous - nums[i] > 0) {
          return false;
        }
      } else {
        if (previous - nums[i] < 0) {
          return false;
        }
      }
      previous = nums[i];
    }
    return true;
  }
}
