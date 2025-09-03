package leetcode;

public class P2446 {
    public boolean haveConflict(String[] event1, String[] event2) {
        String fr_str1 = event1[0].replace(":", "");
        String to_str1 = event1[1].replace(":", "");
        String fr_str2 = event2[0].replace(":", "");
        String to_str2 = event2[1].replace(":", "");
        int fr1 = Integer.parseInt(fr_str1);
        int to1 = Integer.parseInt(to_str1);
        int fr2 = Integer.parseInt(fr_str2);
        int to2 = Integer.parseInt(to_str2);
        return
            (fr1 <= fr2 && fr2 <= to1) ||
            (fr1 <= to2 && to2 <= to1) ||
            (fr2 <= fr1 && fr1 <= to2) ||
            (fr2 <= to1 && to1 <= to2)
            ;
    }
}
