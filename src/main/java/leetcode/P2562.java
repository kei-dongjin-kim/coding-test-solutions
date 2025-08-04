package leetcode;

public class P2562 {
    public long findTheArrayConcVal(int[] nums) {
        long cv = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int pow = 0;
            int rv = nums[right];
            while (rv > 0) {
                int rest = rv % 10;
                cv += rest * (long) Math.pow(10, pow);
                pow++;
                rv /= 10;
            }
            int lv = nums[left];
            while (lv > 0) {
                int rest = lv % 10;
                cv += rest * (long) Math.pow(10, pow);
                pow++;
                lv /= 10;
            }
            left++;
            right--;
        }
        if (nums.length % 2 != 0) {
            cv += nums[(nums.length) / 2];
        }
        return cv;
    }
}
