package leetcode;

public class P1417 {
    public String reformat(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                sb1.append(c);
            } else {
                sb2.append(c);
            }
        }
        int abs = Math.abs(sb1.length() - sb2.length());
        if (abs > 1) {
            return "";
        } else if (abs == 1) {
            StringBuilder tmp = new StringBuilder();
            if (sb1.length() < sb2.length()) {
                tmp = sb1;
                sb1 = sb2;
                sb2 = tmp;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb2.length(); i++) {
            result.append(sb1.charAt(i));
            result.append(sb2.charAt(i));
        }
        if (abs == 1) {
            result.append(sb1.charAt(sb1.length() - 1));
        }
        return result.toString();
    }
}
