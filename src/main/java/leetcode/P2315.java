package leetcode;

public class P2315 {
    public int countAsterisks(String s) {
        int count = 0;
        boolean countable = true;
        for (char c : s.toCharArray()) {
            if (c == '|') {
                countable = !countable;
            } else {
                if (countable && c == '*') {
                    count++;
                }
            }
        }
        return count;
    }
}
