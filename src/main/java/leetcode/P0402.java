package leetcode;

public class P0402 {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (char n : num.toCharArray()) {
            if (sb.isEmpty()) {
                sb.append(n);
            } else {
                int curr = n - '0';
                while (k > 0 && i >= 0 && sb.charAt(i) - '0' > curr) {
                    sb.deleteCharAt(i);
                    i--;
                    k--;
                }
                sb.append(n);
                i++;
            }
        }
        while (k > 0) {
            sb.deleteCharAt(i);
            i--;
            k--;
        }
        while (sb.charAt(0) == '0' && sb.length() > 1) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
