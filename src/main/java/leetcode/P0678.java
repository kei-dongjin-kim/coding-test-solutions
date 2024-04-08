package leetcode;

public class P0678 {
    public boolean checkValidString(String s) {

        int len = s.length();
        int openCount = 0;
        int closeCount = 0;

        for (int i=0 ; i<len ; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '*') {
                openCount++;
            } else {
                openCount--;
                if (openCount < 0) {
                    return false;
                }
            }
            if (s.charAt(len-1-i) == ')' || s.charAt(len-1-i) == '*') {
                closeCount++;
            } else {
                closeCount--;
                if (closeCount < 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
