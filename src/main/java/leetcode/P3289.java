package leetcode;

public class P3289 {
    public int[] getSneakyNumbers(int[] nums) {
        int len = nums.length;
        int index = 0;
        int[] result = new int[2];
        int[] map = new int[len];
        for (int n : nums) {
            if (map[n] == 0) {
                map[n] = 1;
            } else {
                result[index] = n;
                index++;
            }
        }
        return result;
    }
}
