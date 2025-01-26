package leetcode;

public class P3146 {
    public int findPermutationDifference(String s, String t) {
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a'] = i;
        }
        int diff = 0;
        for (int i = 0; i < t.length(); i++) {
            diff += Math.abs(map[t.charAt(i) - 'a'] - i);
        }
        return diff;
    }
}
