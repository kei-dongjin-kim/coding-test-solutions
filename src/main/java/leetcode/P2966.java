package leetcode;

import java.util.Arrays;

public class P2966 {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] result = new int[n/3][];

        for (int i=0 ; i<n ; i+=3) {
            int[] tmp = Arrays.copyOfRange(nums, i, i+3);
            if (tmp[2] - tmp[0] > k) return new int[][] {};
            result[i/3] = tmp;
        }

        return result;
    }
}
