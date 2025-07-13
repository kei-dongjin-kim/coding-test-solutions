package leetcode;

public class P0917 {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        int left = 0;
        int right = len - 1;
        while (left < len) {
            if (Character.isLetter(s.charAt(left))) {
                while (right >= 0) {
                    if (Character.isLetter(s.charAt(right))) {
                        sb.append(s.charAt(right));
                        right--;
                        break;
                    } else {
                        right--;
                    }
                }
            } else {
                sb.append(s.charAt(left));
            }
            left++;
        }
        return sb.toString();
    }
}
