package leetcode;

public class P2490 {
    public boolean isCircularSentence(String sentence) {
        int len = sentence.length();
        for (int i = 0; i < len; i++) {
            if (i == len - 1) {
                if (sentence.charAt(0) != sentence.charAt(len - 1)) {
                    return false;
                }
            } else {
                if (sentence.charAt(i) == ' ') {
                    if (sentence.charAt(i - 1) != sentence.charAt(i + 1)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
