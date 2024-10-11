package leetcode;

public class P0747 {
  public int dominantIndex(int[] nums) {
    int index = 0;
    int first = nums[0];
    int second = 0;
    for (int i=1 ; i<nums.length ; i++) {
      if (first < nums[i]) {
        second = first;
        first = nums[i];
        index = i;
      } else if (second < nums[i]) {
        second = nums[i];
      }
    }
    if (first >= second * 2) {
      return index;
    }
    return -1;
  }
}
