package leetcode;

import java.util.Arrays;

public class P2389 {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] result = new int[queries.length];
        int sum = 0;
        int count = 0;
        Arrays.sort(nums);
        for (int i=0 ; i<queries.length ; i++) {
            sum = 0;
            count = 0;
            for (int j=0 ; j<nums.length ; j++) {
                sum += nums[j];
                if (sum > queries[i]) break;
                else count++;
            }
            result[i] = count;
        }
        return result;
    }
}
