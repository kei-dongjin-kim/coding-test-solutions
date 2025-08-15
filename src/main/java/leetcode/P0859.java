package leetcode;

public class P0859 {
    public boolean buddyStrings(String s, String goal) {
        int slen = s.length();
        if ( slen != goal.length()) {
            return false;
        }
        int[] map = new int[26];
        for (char c : s.toCharArray()) {
            map[c - 'a']++;
        }
        boolean flag = false;
        for (int i : map) {
            if (i > 1) {
                flag = true;
                break;
            }
        }
        for (char c : goal.toCharArray()) {
            map[c - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (map[i] != 0) {
                return false;
            }
        }
        int count = 0;
        for (int i = 0; i < slen; i++ ) {
            if (s.charAt(i) != goal.charAt(i)) {
                count++;
            }
        }
        if (count == 0 && flag) {
            return true;
        }
        if (count == 2) {
            return true;
        }
        return false;
    }
}
