package leetcode;

public class P0392 {
    public boolean isSubsequence(String s, String t) {

        int count = 0;
        int pointer2 = 0;

        for (int i=0 ; i<s.length() ; i++) {
            for (int j=pointer2 ; j<t.length() ; j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    pointer2 = j+1;
                    count++;
                    break;
                }
            }
        }
        return count == s.length();
    }
}
