package leetcode;

public class P1021 {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if ('(' == c) {
                if (count != 0) {
                    sb.append(c);
                }
                count++;
            } else if (')' == c) {
                if (count != 1) {
                    sb.append(c);
                }
                count--;
            }
        }
        return sb.toString();
    }
}
