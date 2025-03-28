package leetcode;

public class P1832 {
    public boolean checkIfPangram(String sentence) {
        int[] map = new int[26];
        for (char c : sentence.toCharArray()) {
            map[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (map[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
