package leetcode;

public class P1848 {
    public int getMinDistance(int[] nums, int target, int start) {
        int len = nums.length;
        int left = start;
        int right = start;
        while (0 <= left || right < len) {
            if (
                0 <= left &&
                nums[left] == target
            ) {
                return start - left;
            }
            if (
                right < len &&
                nums[right] == target
            ) {
                return right - start;
            }
            left--;
            right++;
        }
        return -1;
    }
}
