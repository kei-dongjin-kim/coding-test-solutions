package leetcode;

public class P1903 {
    public String largestOddNumber(String num) {
        int len = num.length();
        for (int i = len - 1; i >= 0; i--) {
            int curr  = num.charAt(i) - '0';
            if (curr % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
