package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class P2231 {
    public int largestInteger(int num) {
        Queue<Integer> q0 = new PriorityQueue<>();
        Queue<Integer> q1 = new PriorityQueue<>();
        List<Integer> list = new ArrayList<>();

        while (num > 0) {
            int rest = num % 10;
            if (rest % 2 == 0) {
                q0.offer(rest);
                list.add(0);
            } else {
                q1.offer(rest);
                list.add(1);
            }
            num = (num - rest) / 10;
        }

        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            int curr = 0;
            if (list.get(i) == 0 && !q0.isEmpty()) curr = q0.poll();
            else if (list.get(i) == 1 && !q1.isEmpty()) curr = q1.poll();
            result += (int) (curr * Math.pow(10, i));
        }
        return result;
    }
}
