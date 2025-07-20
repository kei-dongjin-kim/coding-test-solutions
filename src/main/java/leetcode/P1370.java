package leetcode;

public class P1370 {
    public String sortString(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    char tmp = (char) (i + 'a');
                    sb.append(tmp);
                    freq[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    char tmp = (char) (i + 'a');
                    sb.append(tmp);
                    freq[i]--;
                }
            }
        }
        return sb.toString();
    }
}
