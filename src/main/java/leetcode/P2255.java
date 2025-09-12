package leetcode;

public class P2255 {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String w : words) {
            boolean flag = true;
            for (int i = 0; i < w.length(); i++) {
                if (
                        i >= s.length() ||
                                w.charAt(i) != s.charAt(i)
                ) {
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
