package leetcode;

public class P0005 {
    public String longestPalindrome(String s) {

        if (s.length() <= 1) return s;

        String result = "";

        for (int i=0 ; i<s.length() ; i++) {
            for (int j=i ; j<s.length() ; j++) {

                boolean checker = true;
                for (int k = 0; k < (j - i + 1)/2; k++) {
                    if (s.charAt(i + k) != s.charAt(j - k)) {
                        checker = false;
                        break;
                    }
                }
                if (checker && result.length() < j - i + 1) {
                    result = s.substring(i, j+1);
                }
            }
        }

        return result;
    }
}
