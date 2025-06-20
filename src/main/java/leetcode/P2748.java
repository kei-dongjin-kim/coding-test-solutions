package leetcode;

public class P2748 {
    public int countBeautifulPairs(int[] nums) {
        int count = 0;
        int len = nums.length;
        int[][] arr = new int[len][2];
        for (int i = 0; i < len; i++) {
            int firstDigit = nums[i];
            while (firstDigit > 9) {
                firstDigit /= 10;
            }
            arr[i][0] = firstDigit;
            arr[i][1] = nums[i] % 10;
        }
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (gcd(arr[i][0], arr[j][1])) {
                    count++;
                }
            }
        }
        return count;
    }
    private boolean gcd(int x, int y) {
        for (int i = 2; i < 10; i++) {
            if (x % i == 0 && y % i == 0) {
                return false;
            }
        }
        return true;
    }
}
