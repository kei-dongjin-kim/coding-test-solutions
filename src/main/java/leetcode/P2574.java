package leetcode;

public class P2574 {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];
        int[] leftSum = new int[len];
        int[] rightSum = new int[len];
        for (int i = 1; i < len; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }
        for (int i = len - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }
        for (int i = 0; i < len; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;
    }
}
