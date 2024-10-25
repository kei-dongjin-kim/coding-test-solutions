package leetcode;

public class P0704 {
  public int search(int[] nums, int target) {
    int len = nums.length;
    if (len <= 2) {
      for (int i=0 ; i<len ; i++) {
        if (nums[i] == target) {
          return i;
        }
      }
      return -1;
    }
    
    int left = 0, right = len - 1; 
    while (left <= right) {
      int center = left + (right - left) / 2;
      if (nums[center] == target) {
        return center;
      } else if (nums[center] < target) {
        left = center + 1;
      } else {
        right = center - 1;
      }
    }
    return -1;
  }
}

