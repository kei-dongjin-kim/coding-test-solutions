package leetcode;

import java.util.HashMap;

public class P0383 {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();
        for ( int i=0 ; i<magazine.length() ; i++ ) {
            char m = magazine.charAt(i);
            int count = map.getOrDefault(m, 0);
            map.put(magazine.charAt(i), count + 1);
        }

        for ( int j=0 ; j<ransomNote.length() ; j++ ) {
            char r = ransomNote.charAt(j);
            int count = map.getOrDefault(r, 0);
            if (count <= 0) {
                return false;
            } else {
                map.put(r, count - 1);
            }
        }

        return true;

    }
}