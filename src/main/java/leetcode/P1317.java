package leetcode;

public class P1317 {
    public int[] getNoZeroIntegers(int n) {
        int[] result = new int[2];
        for (int i = 1; i < n; i++) {
            if (!containsZero(i) && !containsZero(n - i)) {
                result[0] = i;
                result[1] = n - i;
                return result;
            }
        }
        return result;
    }
    private boolean containsZero(int n) {
        while (n > 0) {
            if (n % 10 == 0) {
                return true;
            } else {
                n /= 10;
            }
        }
        return false;
    }
}
