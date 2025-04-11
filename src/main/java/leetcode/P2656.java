package leetcode;

public class P2656 {
    public int maximizeSum(int[] nums, int k) {
        int ans = 0;
        int max = 0;
        for (int n : nums) {
            max = Math.max(max, n);
        }
        for (int i = 0; i < k; i++) {
            ans += max++;
        }
        return ans;
    }
}
