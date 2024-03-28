package leetcode;

public class P0713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int count = 0;
        int left = 0;
        int right = 0;
        int product = 1;
        while (right < nums.length) {
            product *= nums[right];
            while (product >= k) {
                product /= nums[left];
                left++;
            }
            count += right - left + 1;
            right++;
        }
        return count;

//        int count = 0;
//        for (int i=0 ; i<nums.length ; i++) {
//            int tmp = 1;
//            for (int j=i ; j<nums.length ; j++) {
//                tmp *= nums[j];
//                if (tmp < k) count++;
//                if (tmp > k) break;
//            }
//        }
//        return count;
    }
}
