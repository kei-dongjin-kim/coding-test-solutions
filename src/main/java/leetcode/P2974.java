package leetcode;

import java.util.Arrays;

public class P2974 {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for(int i=0 ; i<nums.length ; i+=2){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
        return nums;

        // int[] result = new int[nums.length];
        // Queue<Integer> queue = new PriorityQueue<>();
        // for (int num : nums) queue.offer(num);
        // int index = 0;
        // while (!queue.isEmpty()) {
        //     int first = queue.poll();
        //     int second = queue.poll();
        //     result[index++] = second;
        //     result[index++] = first;
        // }
        // return result;
    }
}
