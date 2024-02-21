package leetcode;

public class P0268 {
    public int missingNumber(int[] nums) {

        // 1, ... , n = n * (n+1) / 2
        int n = nums.length;
        int total = (n * (n+1)) / 2;
        int sum = 0;
        for (int num : nums) sum += num;
        return total - sum;

        // Another solution:
        // Arrays.sort(nums);
        // for (int i=0 ; i<nums.length ; i++) {
        //     if (i != nums[i]) return i;
        // }
        // return nums.length;
    }
}
