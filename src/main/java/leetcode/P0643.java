package leetcode;

public class P0643 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double max = (double) sum / k;
        for (int i = k; i < nums.length; i++) {
            sum += (nums[i] - nums[i - k]);
            double avg = (double) sum / k;
            max = Math.max(max, avg);
        }
        return max;
    }
}
