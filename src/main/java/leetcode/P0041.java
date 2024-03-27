package leetcode;

public class P0041 {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        boolean[] taken = new boolean[len+1];

        // This loop goes through each number in the array.
        for (int num : nums) {
            // If the number is positive and less than or equal to the length of the array,
            // it is marked as 'taken' in the boolean array.
            if (0 < num && num <= nums.length) {
                taken[num] = true;
            }
        }

        // This loop goes from 1 to 'len' to find the first positive integer that is not taken.
        for (int i=1 ; i<=len ; i++) {
            // If a number is not taken, it is returned as the first missing positive integer.
            if (!taken[i]) {
                return i;
            }
        }

        // If all numbers from 1 to 'len' are taken, then the first missing positive integer is 'len + 1'.
        return len + 1;
    }
}
