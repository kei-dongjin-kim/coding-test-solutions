package leetcode;

public class P0219 {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    int last_index = nums.length - 1;
    for (int i=0 ; i<=last_index ; i++) {
      int end = i + k <= last_index ? i + k : last_index;
      for (int j=i+1 ; j<=end ; j++) {
        if (nums[i] == nums[j]) {
          return true;
        }
      }
    }
    return false;
  }
}
