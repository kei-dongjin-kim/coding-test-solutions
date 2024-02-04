package leetcode;

public class P1413 {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            sum += num;
            min = Math.min(min, sum);
        }
        return Math.max(1 - min, 1);
    }
}
