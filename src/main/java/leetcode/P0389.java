package leetcode;

public class P0389 {
    public char findTheDifference(String s, String t) {
        int[] map = new int[26];
        for (char c : t.toCharArray()) {
            map[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            map[c - 'a']--;
        }
        for (int i = 0; i < 26 ; i++) {
            if (map[i] == 1) {
                return (char) (i + 'a');
            }
        }
        return ' ';
    }
}
