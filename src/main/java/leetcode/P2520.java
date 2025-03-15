package leetcode;

public class P2520 {
    public int countDigits(int num) {
        int count = 0;
        int copied = num;
        while (copied > 0) {
            int rest  = copied % 10;
            if (num % rest == 0) {
                count++;
            }
            copied /= 10;
        }
        return count;
    }
}
