package leetcode;

public class P1816 {
    public String truncateSentence(String s, int k) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                count++;
                if (count == k) {
                    break;
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
