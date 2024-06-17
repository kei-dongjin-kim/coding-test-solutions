package leetcode;

public class P0633 {
    public boolean judgeSquareSum(int c) {
        for (long i=0 ; i * i <= c ; i++) {
            double tmp = Math.sqrt(c - (i * i));
            if (tmp == (int)tmp) return true;
        }
        return false;
    }
}
