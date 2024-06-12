package leetcode;

public class P0075 {
    public void sortColors(int[] nums) {
        // Insertion sort
        int len = nums.length;
        for (int i=1 ; i<len ; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
}
