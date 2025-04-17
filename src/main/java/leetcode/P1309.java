package leetcode;

public class P1309 {
    public String freqAlphabets(String s) {
        int index = s.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (index >= 0) {
            String sub = "";
            if (s.charAt(index) == '#') {
                sub = s.substring(index - 2, index);
                index -= 3;
            } else {
                sub = s.substring(index, index + 1);
                index--;
            }
            int num = Integer.parseInt(sub);
            char c = (char) ('a' - 1 + num);
            sb.append(c);
        }
        return sb.reverse().toString();
    }
}
