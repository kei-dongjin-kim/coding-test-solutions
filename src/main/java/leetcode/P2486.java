package leetcode;

public class P2486 {
    public int appendCharacters(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        int si = 0, ti = 0;
        while (si < slen && ti < tlen) {
            if (s.charAt(si) == t.charAt(ti)) {
                ti++;
            }
            si++;
        }
        return tlen - ti;
    }
}
