package leetcode;

public class P2278 {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == letter) {
                count++;
            }
        }
        return count * 100 / s.length();
    }
}
