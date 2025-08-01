package leetcode;

public class P2544 {
    public int alternateDigitSum(int n) {
        int i = 0;
        int sum = 0;
        while (n > 0) {
            int rest = n % 10;
            int sign = i % 2 == 0 ? 1 : -1;
            sum += (rest * sign);
            n /= 10;
            i++;
        }
        if (i % 2 == 0) {
            sum *= -1;
        }
        return sum;
    }
}
