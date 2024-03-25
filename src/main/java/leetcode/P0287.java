package leetcode;

public class P0287 {
    public int findDuplicate(int[] nums) {
        boolean[] arr = new boolean[nums.length + 1];
        for (int num : nums) {
            if (arr[num]) return num;
            arr[num] = true;
        }
        return 0;
    }
}
