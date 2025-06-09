package leetcode;

public class P3038 {
    public int maxOperations(int[] nums) {
        int len = nums.length;
        int score = nums[0] + nums[1];
        int index = 2;
        int count = 1;
        while (
                (index < len - 1) &&
                        (nums[index] + nums[index + 1] == score)
        ) {
            count++;
            index += 2;
        }
        return count;
    }
}
