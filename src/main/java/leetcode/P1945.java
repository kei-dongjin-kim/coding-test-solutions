package leetcode;

public class P1945 {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int tmp = c - 'a' + 1;
            sb.append(tmp);
        }
        for (int i = 0 ; i < k ; i++) {
            int tmp = 0;
            for (int j = 0 ; j < sb.length() ; j++) {
                tmp += sb.charAt(j) - '0';
            }
            sb = new StringBuilder(String.valueOf(tmp));
        }
        return Integer.parseInt(sb.toString());
    }
}
