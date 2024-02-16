package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P0368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int[][] dp = new int[nums.length][];
        dp[0] = new int[] {nums[0]};
        int count = 0;
        // dp
        for (int i=1 ; i<nums.length ; i++)  {
            // dp
            boolean found = true;
            for (int j : dp[i-1]) {
                if (nums[i] % j != 0) {
                    found = false;
                    break;
                }
            }
            if (found) {
                int[] newArr = new int[dp[i-1].length + 1];
                System.arraycopy(dp[i-1], 0, newArr, 0, dp[i-1].length);
                newArr[dp[i-1].length] = nums[i];
                dp[i] = newArr;
                count++;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i=0 ; i<dp[count].length ; i++) {
            result.add(dp[count][i]);
        }

        return  result;
    }
}
