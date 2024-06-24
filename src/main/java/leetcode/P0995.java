package leetcode;

public class P0995 {
    public int minKBitFlips(int[] nums, int k) {
        int currentFlips = 0;
        int totalFlips = 0;

        for (int i=0 ; i<nums.length ; i++) {
            // If we are beyond the kth element and the element at position i-k is 2,
            // it means we have made a flip at position i-k that we can now ignore
            if (i >= k && nums[i - k] == 2) {
                currentFlips--;
            }

            // If the current number of flips is even and the current element is 0,
            // or if the current number of flips is odd and the current element is 1,
            // we need to make a flip
            if ((currentFlips % 2) == nums[i]) {
                // If we can't make a flip
                // because we are too close to the end of the array,
                // return -1
                if (i + k > nums.length) {
                    return -1;
                }

                // Mark the element at position i as flipped
                nums[i] = 2;
                currentFlips++;
                totalFlips++;
            }
        }

        return totalFlips;
    }
}
