package leetcode;

public class P2437 {
    public int countTime(String time) {
        int res = 1;
        if (time.charAt(0) == '?') {
            if (
                time.charAt(1) == '0' ||
                time.charAt(1) == '1' ||
                time.charAt(1) == '2' ||
                time.charAt(1) == '3'
            ) {
                res *= 3;
            } else {
                res *= 2;
            }
        }
        if (time.charAt(1) == '?') {
            if (time.charAt(0) == '2') {
                res *= 4;
            } else if (time.charAt(0) == '?') {
                res *= 12;
            } else {
                res *= 10;
            }
        }
        if (time.charAt(3) == '?') {
            res *= 6;
        }
        if (time.charAt(4) == '?') {
            res *= 10;
        }
        return res;
    }
}
