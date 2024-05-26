package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0140 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> result = new ArrayList<>();
        int len = s.length();
        for (int i=1 ; i<(1 << len) ; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(0));
            for (int j=1 ; j<len ; j++) {
                if ((i & (1 << j)) > 0) {
                    sb.append(" ");
                }
                sb.append(s.charAt(j));
            }
            boolean chk = true;
            String curr = sb.toString();
            for (String w : curr.split(" ")) {
                if (!wordDict.contains(w)) {
                    chk = false;
                    break;
                }
            }
            if (chk && !result.contains(curr)) result.add(curr);
        }
        return result;
    }
}
