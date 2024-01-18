package leetcode;

public class P0003 {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        String temp = "";
        String result = "";

        for (int i=0 ; i<s.length() ; i++) {
            int index = temp.indexOf(s.charAt(i));
            if (index != -1) {
                start = start + index + 1;
            }
            temp = s.substring(start, i+1);
            if (result.length() < temp.length()) result = temp;
        }

        return result.length();
    }
}
