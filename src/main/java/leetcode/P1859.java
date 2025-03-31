package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P1859 {
    public String sortSentence(String s) {
        Map<Integer, String> map = new HashMap<>();
        for (String w : s.split(" ")) {
            int len = w.length();
            String val = w.substring(0, len - 1);
            int key = Integer.parseInt(w.substring(len - 1, len));
            map.put(key, val);
        }
        StringBuilder sb = new StringBuilder();
        int size = map.size();
        for (int i = 1; i <= size; i++) {
            sb.append(map.get(i));
            if (i != size) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
