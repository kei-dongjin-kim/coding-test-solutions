package leetcode;

public class P3216 {
    public String getSmallestString(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len - 1; i++) {
            int rest1 = s.charAt(i) - '0';
            int rest2 = s.charAt(i + 1) - '0';
            if (
                    (rest1 % 2 == rest2 % 2) &&
                            rest1 > rest2
            ) {
                sb.append(s.substring(0, i));
                sb.append(s.charAt(i + 1));
                sb.append(s.charAt(i));
                if (i + 2 < len) {
                    sb.append(s.substring(i + 2));
                }
                return sb.toString();
            }
        }
        return s;
    }
}
