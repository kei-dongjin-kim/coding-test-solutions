package leetcode;

public class P1957 {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        char currChar = ' ';
        int currCount = 0;
        for (char c : s.toCharArray()) {
            if (currChar == c) {
                if (currCount < 2) {
                    sb.append(c);
                    currCount++;
                }
            } else {
                sb.append(c);
                currChar = c;
                currCount = 1;
            }
        }
        return sb.toString();
    }
}
