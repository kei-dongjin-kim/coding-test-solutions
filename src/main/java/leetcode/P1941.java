package leetcode;

public class P1941 {
    public boolean areOccurrencesEqual(String s) {
        int[] alphabet = new int[26];
        for (char c : s.toCharArray()) {
            alphabet[c - 'a']++;
        }
        int count = alphabet[s.charAt(0) - 'a'];
        for (int i : alphabet) {
            if (i != 0 && i != count)
                return false;
        }
        return true;
    }
}
