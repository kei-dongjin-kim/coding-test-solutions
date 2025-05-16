package leetcode;

public class P1995 {
    public int countQuadruplets(int[] nums) {
        int count = 0;
        int len = nums.length;
        for (int a = 0; a < len; a++) {
            for (int b = a + 1; b < len; b++) {
                for (int c = b + 1; c < len; c++) {
                    for (int d = c + 1; d < len; d++) {
                        if (nums[a] + nums[b] + nums[c] == nums[d]) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
