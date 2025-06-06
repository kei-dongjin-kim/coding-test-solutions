package leetcode;

public class P1897 {
    public boolean makeEqual(String[] words) {
        int len = words.length;
        if (len == 1) {
            return true;
        }
        int count = 0;
        int[] freq = new int[26];
        for (String w : words) {
            for (char c : w.toCharArray()) {
                freq[c - 'a']++;
            }
            count += w.length();
        }
        if (count % len != 0) {
            return false;
        }
        for (int f : freq) {
            if (f % len != 0) {
                return false;
            }
        }
        return true;
    }
}
