package leetcode;

public class P1071 {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int min = Math.min(len1, len2);
        int largest = 0;
        for (int len = 1; len <= min; len++) {
            if (
                    len1 % len == 0 &&
                            len2 % len == 0
            ) {
                boolean flag1 = true;
                outerLoop1:
                for (int left1 = 0; left1 < len1; left1 += len) {
                    for (int k = 0; k < len; k++) {
                        if (str1.charAt(k) != str1.charAt(left1 + k)) {
                            flag1 = false;
                            break outerLoop1;
                        }
                    }
                }
                boolean flag2 = true;
                if (flag1) {
                    outerLoop2:
                    for (int left2 = 0; left2 < len2; left2 += len) {
                        for (int k = 0; k < len; k++) {
                            if (str1.charAt(k) != str2.charAt(left2 + k)) {
                                flag2 = false;
                                break outerLoop2;
                            }
                        }
                    }
                }
                if (flag1 && flag2) {
                    largest = Math.max(largest, len);
                }
            }
        }
        return str1.substring(0, largest);
    }
}
