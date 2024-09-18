package leetcode;

import java.util.Objects;
import java.util.PriorityQueue;

public class P0179 {
    public String largestNumber(int[] nums) {
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> (b + a).compareTo(a + b));
        for (int n : nums) {
            pq.add(Integer.toString(n));
        }
        if (Objects.equals(pq.peek(), "0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            String tmp = pq.poll();
            sb.append(tmp);
        }
        return sb.toString();
    }
}
