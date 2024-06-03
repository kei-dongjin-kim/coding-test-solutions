package leetcode;

public class P0344 {
    public char[] reverseString(char[] s) {
        int len = s.length;
        for (int i=0 ; i<len/2 ; i++) {
            char tmp = s[i];
            s[i] = s[len - 1 - i];
            s[len - 1 - i] = tmp;
        }
        return s;
    }
}
