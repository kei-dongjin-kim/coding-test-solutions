package leetcode;

public class P0724 {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        if (len == 1) return 0;
        int[] sumLeft = new int[len];
        sumLeft[0] = 0;
        sumLeft[1] = nums[0];
        for (int i=2 ; i<len ; i++) {
            sumLeft[i] = sumLeft[i-1] + nums[i-1];
        }
        int[] sumRight = new int[len];
        sumRight[len-1] = 0;
        sumRight[len-2] = nums[len-1];
        for (int j=len-3 ; j>=0 ; j--) {
            sumRight[j] = sumRight[j+1] + nums[j+1];
        }
        for (int k=0 ; k<len ; k++) {
            if (sumLeft[k] == sumRight[k]) return k;
        }
        return -1;
    }
}
