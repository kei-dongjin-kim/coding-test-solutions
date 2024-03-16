package leetcode;

import java.util.Arrays;

public class P0238 {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] products = new int[len];

        int prefix = 1;
        for (int i=0 ; i<len ; i++) {
            products[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for (int i=len-1 ; i>=0 ; i--) {
            products[i] *= suffix;
            suffix *= nums[i];
        }

        return products;
    }
}
