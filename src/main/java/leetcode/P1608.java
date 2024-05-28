package leetcode;

import java.util.Arrays;

public class P1608 {
    public int specialArray(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        for (int i=0 ; i<=len ; i++) {
            int count = 0;
            for (int n : nums) if (n >= i) count++;
            if (i == count) return i;
        }
        return -1;
    }
}
