package leetcode;

//import java.util.HashMap;
//import java.util.Map;

import java.util.Arrays;

public class P2423 {
    public boolean equalFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) freq[c - 'a']++;
        int[] counts = Arrays.stream(freq).filter(f -> f > 0).toArray();
        Arrays.sort(counts);
        int len = counts.length;
        // If there is only one kind of frequency, return true.
        if (len == 1)
            return true;
        // If the first frequency is 1 and the rest are the same, return true.
        if (counts[0] == 1 && counts[1] == counts[len - 1])
            return true;
        // If the last frequency minus 1 is the same as the rest, return true.
        if (counts[0] == counts[len - 2] && counts[len - 2] == counts[len - 1] - 1)
            return true;
        return false;
    }

//    public boolean equalFrequency(String word) {
//        int[] freqs = new int[26];
//        for (char c : word.toCharArray()) freqs[c - 'a']++;
//
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int f : freqs) {
//            if (f != 0) {
//                map.put(f, map.getOrDefault(f, 0) + 1);
//            }
//        }
//
//        if (map.isEmpty()) return true;
//        else if (map.size() == 1) {
//            // It's true, if freq is 1.
//            if (map.containsKey(1)) return true;
//            else return false;
//        } else if (map.size() == 2) {
//            int min = Integer.MAX_VALUE;
//            int max = Integer.MIN_VALUE;
//            for (int key : map.keySet()) {
//                min = Math.min(min, key);
//                max = Math.max(max, key);
//            }
//            if (max - min != 1) return false;
//            if (map.get(min) != 1 && map.get(max) != 1) return false;
//        } else {
//            // It's false, if kind of freq is more than 2.
//            return false;
//        }
//        return true;
//    }
}
