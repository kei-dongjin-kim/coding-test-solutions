package leetcode;

public class P0977 {
    public int[] sortedSquares(int[] nums) {

        int[] squared = new int[nums.length];
        for (int i=0 ; i<nums.length ; i++) {
            squared[i] = nums[i] * nums[i];
        }

        // Arrays.sort(squared);
        int tmp = 0;
        for (int a=0 ; a<squared.length ; a++) {
            for (int b=a+1 ; b<squared.length ; b++) {
                if (squared[a] > squared[b]) {
                    tmp = squared[a];
                    squared[a] = squared[b];
                    squared[b] = tmp;
                }
            }
        }

        return squared;
    }
}
