package leetcode;

public class P0762 {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            int bc = Integer.bitCount(i);
            if (isPrime(bc)) {
                count++;
            }
        }
        return count;
    }
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
