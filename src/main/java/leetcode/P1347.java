package leetcode;

import java.util.HashMap;

public class P1347 {
    public int minSteps(String s, String t) {

        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for ( int i=0 ; i<s.length() ; i++ ) {
            char c = s.charAt(i);
            int count = map.getOrDefault(c, 0);
            map.put(c, count + 1);
        }

        System.out.println(map.toString());

        for ( int j=0 ; j<t.length() ; j++ ) {
            char c = t.charAt(j);
            int count = map.getOrDefault(c, 0);
            if (count <= 0) {
                result++;

            } else {
                map.put(c, count - 1);
            }
        }

        return result;
    }
}
