package leetcode;

public class P2190 {
    public int mostFrequent(int[] nums, int key) {
        int len = nums.length;
        int[] arr = new int[1001];
        for (int i = 0; i < len; i++) {
            if (
                    nums[i] == key &&
                            i + 1 < len
            ) {
                arr[nums[i + 1]]++;
            }
        }
        int max_key = -1;
        int max_val = -1;
        for (int i = 0; i < 1001; i++) {
            if (arr[i] > max_val) {
                max_val = arr[i];
                max_key = i;
            }
        }
        return max_key;
    }
}
