package leetcode;

import java.util.*;

public class P0621 {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();
        for (char task : tasks) {
            map.put(task, map.getOrDefault(task, 0) + 1);
        }

        Queue<Character> queue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        int intervals = 0;

        while (!map.isEmpty()) {
            // Creating a priority queue and adding all tasks to it.
            // The queue is sorted based on the frequency of tasks, with higher frequency tasks having higher priority.
            queue.clear();
            for (char c : map.keySet()) {
                queue.offer(c);
            }

            // We will eliminate item
            for (int i=0 ; i<=n ; i++) {
                if (map.isEmpty()) break;
                intervals++;
                Character c = queue.poll();
                if (c == null) {
                    continue;
                } else {
                    int rest = map.get(c) - 1;
                    if (rest == 0) map.remove(c);
                    else map.put(c, rest);
                }
            }
        }

        return intervals;
    }
}
