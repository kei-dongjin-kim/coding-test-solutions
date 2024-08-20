package leetcode;

public class P0283 {
    public void moveZeroes(int[] nums) {

        int j = 0;
        int temp = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] != 0) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }

        // int len = nums.length;
        // int left = 0;
        // int right = len - 1;
        // while (left < right) {
        //     if (nums[left] == 0) {
        //         for (int j = left ; j < right ; j++) {
        //             nums[j] = nums[j + 1];
        //         }
        //         nums[right] = 0;
        //         right--;
        //     } else {
        //         left++;
        //     }
        // }
    }
}
