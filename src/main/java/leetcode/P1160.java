package leetcode;

public class P1160 {
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        int[] origin = new int[26];
        int[] copied = new int[26];
        for (char c : chars.toCharArray()) {
            origin[c - 'a']++;
        }
        for (String w : words) {
            boolean flag = true;
            System.arraycopy(origin, 0, copied, 0, 26);
            for (char c : w.toCharArray()) {
                if (--copied[c - 'a'] < 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count += w.length();
            }
        }
        return count;
    }
}
