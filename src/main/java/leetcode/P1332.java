package leetcode;

public class P1332 {
    public int removePalindromeSub(String s) {
        boolean is = checkPalindromic(s);
        if (is) {
            return 1;
        }
        return 2;
    }
    private boolean checkPalindromic(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
