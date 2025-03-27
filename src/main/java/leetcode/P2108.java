package leetcode;

public class P2108 {
    public String firstPalindrome(String[] words) {
        for (String s : words) {
            int left = 0;
            int right = s.length() - 1;
            boolean p = true;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    p = false;
                    break;
                }
                left++;
                right--;
            }
            if (p) {
                return s;
            }
        }
        return "";
    }
}
