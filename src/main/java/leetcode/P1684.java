package leetcode;

public class P1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            boolean check = true;
            for (char c : word.toCharArray()) {
                if (allowed.indexOf(c) == -1) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
            }
        }
        return count;
    }
}
