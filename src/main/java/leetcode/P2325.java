package leetcode;

import java.util.Map;
import java.util.HashMap;

public class P2325 {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        int mapi = 0;
        int idx = 0;
        while (mapi < 26 && idx < key.length()) {
            char c = key.charAt(idx);
            if (c != ' ' && map.get(c) == null) {
                map.put(c, (char) ('a' + mapi));
                mapi++;
            }
            idx++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c == ' ') {
                sb.append(' ');
            } else {
                sb.append(map.get(c));
            }
        }
        return sb.toString();
    }
}
