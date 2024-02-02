package leetcode;

public class P0303 {
    int[] prefixSum;

    public P0303(int[] nums) {
        int len = nums.length;
        prefixSum = new int[len];
        prefixSum[0] = nums[0];
        for (int i=1 ; i<len ; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum[right] - (left == 0 ? 0 : prefixSum[left-1]);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */