package leetcode;

public class P2460 {
    public int[] applyOperations(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }
        int[] arr = new int[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                arr[index] = nums[i];
                index++;
            }
        }
        return arr;
    }
}
