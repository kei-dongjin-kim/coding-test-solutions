package leetcode;

public class P0974 {
    public int subarraysDivByK(int[] nums, int k) {
        int prefixMod = 0;
        int result = 0;
        int[] modGroups = new int[k];
        modGroups[0] = 1;

        for (int num : nums) {
            prefixMod = (prefixMod + num % k + k) % k;
            result += modGroups[prefixMod];
            modGroups[prefixMod]++;
        }

        return result;
    }

    //
    // The following solution is brute force and has been timed out
    //
    // public int subarraysDivByK(int[] nums, int k) {
    //     int count = 0;
    //     int len = nums.length;
    //     int[] prefixSum = getPrefixSum(nums);
    //     for (int i=0 ; i<len ; i++) {
    //         for (int j=i ; j<len ; j++) {
    //             int sum = rangeSum(prefixSum, i, j);
    //             if (sum % k == 0) count++;
    //         }
    //     }
    //     return count;
    // }
    // public int[] getPrefixSum(int[] arr) {
    //     int len = arr.length;
    //     int[] prefixSum = new int[len];
    //     prefixSum[0] = arr[0];
    //     for (int i=1 ; i<len ; i++) {
    //         prefixSum[i] = prefixSum[i-1] + arr[i];
    //     }
    //     return prefixSum;
    // }
    // public int rangeSum(int[] arr, int i, int j) {
    //     if (i == 0) return arr[j];
    //     else return arr[j] - arr[i-1];
    // }
}
