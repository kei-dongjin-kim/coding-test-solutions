package leetcode;

public class P1991 {
    public int findMiddleIndex(int[] nums) {
        int len = nums.length;
        int[] sumLeft = new int[len];
        int[] sumRight = new int[len];
        sumLeft[0] = nums[0];
        for (int i = 1; i < len; i++) {
            sumLeft[i] = sumLeft[i - 1] + nums[i];
        }
        sumRight[len - 1] = nums[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            sumRight[i] = sumRight[i + 1] + nums[i];
        }
        for (int i = 0; i < len; i++) {
            if (sumLeft[i] == sumRight[i]) {
                return i;
            }
        }
        return -1;
    }
}
