package leetcode;

public class P0028 {
    public int strStr(String haystack, String needle) {
        int len_h = haystack.length();
        int len_n = needle.length();
        for (int i = 0; i < len_h - len_n + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                boolean flag = true;
                for (int j = 0; j < len_n; j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return i;
                }
            }
        }
        return -1;
    }
}
