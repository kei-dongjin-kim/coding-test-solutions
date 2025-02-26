package leetcode;

public class P1313 {
    public int[] decompressRLElist(int[] nums) {
        int lengthOfResult = 0;
        int len = nums.length;
        for (int i = 0; i < len; i += 2) {
            lengthOfResult += nums[i];
        }
        int[] result = new int[lengthOfResult];
        int idx = 0;
        for (int i = 0; i < len; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                result[idx] = nums[i + 1];
                idx++;
            }
        }
        return result;
    }
}
