package leetcode;

public class P2697 {
    public String makeSmallestPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (s.charAt(left) < s.charAt(right)) {
                    sb.setCharAt(right, s.charAt(left));
                } else {
                    sb.setCharAt(left, s.charAt(right));
                }
            }
            left++;
            right--;
        }
        return sb.toString();
    }
}
