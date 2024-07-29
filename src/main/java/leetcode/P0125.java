package leetcode;

public class P0125 {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : lower.toCharArray()) {
            if (
                ('a' <= c && c <= 'z') ||
                ('0' <= c && c <= '9')
            ) {
                sb.append(c);
            }
        }
        int left = 0;
        int right = sb.length() - 1;
        while (left < right) {
            if (sb.charAt(left++) != sb.charAt(right--))
                return false;
        }
        return true;
    }
}
