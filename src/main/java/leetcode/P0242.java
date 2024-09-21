package leetcode;

// import java.util.HashMap;
// import java.util.Map;

public class P0242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charCounts = new int[26];
        for (char c : s.toCharArray()) {
            charCounts[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            charCounts[c - 'a']--;
        }
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//        Map<Character, Integer> map = new HashMap<>();
//        for (char c : s.toCharArray()) {
//            map.merge(c, 1, Integer::sum);
//        }
//        for (char c : t.toCharArray()) {
//            int curr = map.getOrDefault(c, 0);
//            if (curr > 1) {
//                map.put(c, curr - 1);
//            } else if (curr == 1) {
//                map.remove(c);
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }

}
