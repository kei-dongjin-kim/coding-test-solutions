package leetcode;

public class P2444 {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        // indices
        int min = -1, max = -1, left = -1, right = 0;
        while (right < nums.length) {
            // If the current number is out of the range, reset the pointers
            if (nums[right] < minK || nums[right] > maxK) {
                min = right;
                max = right;
                left = right;
            }
            // If the current number is the min, update the min pointers
            min = nums[right] == minK ? right : min;
            // If the current number is the max, update the max pointers
            max = nums[right] == maxK ? right : max;
            // Count the subarrays between the left and right pointers
            // For example, if the array is [1,3,5,2,7,5], minK = 1, maxK = 5
            // The subarrays are [1,3,5], [1,3,5,2]
            // [1] right:0, left:-1, min:0, max:-1, Math.min(min, max) - left:0, count:0
            // [3] right:1, left:-1, min:0, max:-1, Math.min(min, max) - left:0, count:0
            // [5] right:2, left:-1, min:0, max:2,  Math.min(min, max) - left:1, count:1
            // [2] right:3, left:-1, min:0, max:2,  Math.min(min, max) - left:1, count:2
            // [7] right:4, left:4,  min:4, max:4,  Math.min(min, max) - left:0, count:2
            // [5] right:5, left:4,  min:4, max:5,  Math.min(min, max) - left:0, count:2
            count += Math.min(min, max) - left;
            right++;
        }
        return count;
    }
}
