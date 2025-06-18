package leetcode;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class P2465 {
    public int distinctAverages(int[] nums) {
        int len = nums.length;
        Set<Integer> set1 = new HashSet<>();
        Arrays.sort(nums);
        int left = 0;
        int right = len - 1;
        for (int i = 0; i < len/2; i++) {
            set1.add(nums[left] + nums[right]);
            left++;
            right--;
        }
        return set1.size();
    }
}
