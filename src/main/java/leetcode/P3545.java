package leetcode;

public class P3545 {
    public int minDeletion(String s, int k) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < k; i++) {
            int max_idx = 0;
            for (int j = 0; j < 26; j++) {
                if (freq[max_idx] < freq[j]) {
                    max_idx = j;
                }
            }
            freq[max_idx] = 0;
        }
        int sum = 0;
        for (int i : freq) {
            sum += i;
        }
        return sum;
    }
}
