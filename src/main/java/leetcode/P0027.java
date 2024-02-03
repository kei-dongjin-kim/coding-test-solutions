package leetcode;

public class P0027 {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i=0 ; i<nums.length ; i++) {
            if (nums[i] != val) {
                int tmp = nums[result];
                nums[result] = nums[i];
                nums[i] = tmp;
                result++;
            }
        }
        return result;
    }
}
