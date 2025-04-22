package leetcode;

public class P1189 {
    public int maxNumberOfBalloons(String text) {
        String BALLOON = "balloon";
        int[] map = new int[26];
        for (char c : text.toCharArray()) {
            map[c - 'a']++;
        }
        int count = 0;
        int max = text.length() / BALLOON.length();
        for (int i = 0; i < max; i++) {
            for (char c : BALLOON.toCharArray()) {
                if (map[c - 'a'] > 0) {
                    map[c - 'a']--;
                } else {
                    return count;
                }
            }
            count++;
        }
        return count;
    }
}
