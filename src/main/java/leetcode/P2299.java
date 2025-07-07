package leetcode;

public class P2299 {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean flag = true;
        char[] parr = password.toCharArray();
        for (char c : parr) {
            if (Character.isLowerCase(c)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return false;
        }
        flag = true;
        for (char c : parr) {
            if (Character.isUpperCase(c)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return false;
        }
        flag = true;
        for (char c : parr) {
            if (Character.isDigit(c)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return false;
        }
        flag = true;
        for (char c : parr) {
            if ("!@#$%^&*()-+".indexOf(c) != -1) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return false;
        }
        for (int i = 1; i < parr.length; i++) {
            if (parr[i - 1] == parr[i]) {
                return false;
            }
        }
        return true;
    }
}
