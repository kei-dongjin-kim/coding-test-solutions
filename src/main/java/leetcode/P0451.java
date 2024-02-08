package leetcode;

import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;

public class P0451 {
    public String frequencySort(String s) {

        // Map
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Sort by priority queue
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> freqMap.get(b) - freqMap.get(a));
        pq.addAll(freqMap.keySet());

        // Print by freq
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char c = pq.poll();
            for (int i=0 ; i<freqMap.get(c) ; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
