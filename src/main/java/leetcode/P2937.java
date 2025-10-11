package leetcode;

public class P2937 {
    public int findMinimumOperations(String s1, String s2, String s3) {
        if (
            s1.charAt(0) != s2.charAt(0) ||
            s2.charAt(0) != s3.charAt(0)
        ) {
            return -1;
        }
        int curr = 0;
        int min = Math.min(s1.length(), s2.length());
        min = Math.min(min, s3.length());
        while (curr < min) {
            if (
                s1.charAt(curr) != s2.charAt(curr) ||
                s2.charAt(curr) != s3.charAt(curr)
            ) {
                break;
            }
            curr++;
        }
        return s1.length() - curr + s2.length() - curr + s3.length() - curr;
    }
}
