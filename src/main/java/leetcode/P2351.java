package leetcode;

public class P2351 {
    public char repeatedCharacter(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()) {
            if (++freq[c - 'a'] == 2) {
                return c;
            }
        }
        return ' ';
    }
}
