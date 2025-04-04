package leetcode;

public class P1844 {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                sb.append(s.charAt(i));
            } else {
                char tmp = (char) (s.charAt(i - 1) + (int) s.charAt(i) - '0');
                sb.append(tmp);
            }
        }
        return sb.toString();
    }
}
