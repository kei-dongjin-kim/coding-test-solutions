package leetcode;

public class P0330 {
    public int minPatches(int[] nums, int n) {
        int patches = 0;
        long missing = 1;
        int index = 0;
        while (missing <= n) {
            if (index < nums.length && nums[index] <= missing) {
                missing += nums[index];
                index++;
            } else {
                missing += missing;
                patches++;
            }
        }
        return patches;
    }
}
