package leetcode;

public class P2185 {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String w : words) {
            if (w.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}
