package leetcode;

import java.util.Arrays;

public class P0414 {
  public int thirdMax(int[] nums) {
    int len = nums.length;
    Arrays.sort(nums);
    if (len <= 2) {
      return nums[len-1];
    }
    int rank = 1;
    int curr = nums[len-1];
    for (int i=len-2 ; 0<=i ; i--) {
      if (curr == nums[i]) {
        continue;
      } else {
        curr = nums[i];
        rank++;
      }
      if (rank == 3) {
        break;
      }
    }
    if (rank < 3) {
      return nums[len-1];
    }
    return curr;
  }
}
