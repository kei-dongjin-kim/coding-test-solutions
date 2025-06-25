package leetcode;

public class P2287 {
    public int rearrangeCharacters(String s, String target) {
        int[] freq = new int [26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int count = 0;
        boolean flag = true;
        while (flag) {
            for (char c : target.toCharArray()) {
                if (--freq[c - 'a'] < 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }
}
