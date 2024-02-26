package leetcode;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.PriorityQueue;
//import java.util.Queue;

import java.util.Arrays;

public class P2500 {
    public int deleteGreatestValue(int[][] grid) {
        for (int[] g : grid) Arrays.sort(g);
        int sum = 0;
        for (int i=0 ; i<grid[0].length ; i++) {
            int max = 0;
            for (int[] g : grid) {
                max = Math.max(max, g[i]);
            }
            sum += max;
        }
        return sum;

//        List<Queue> list = new ArrayList<>();
//        for (int[] row : grid) {
//            Queue<Integer> queue = new PriorityQueue<>((a, b) -> b-a);
//            for (int item : row) {
//                queue.offer(item);
//            }
//            list.add(queue);
//        }
//        int sum = 0;
//        while (!list.isEmpty() && !list.getFirst().isEmpty()) {
//            int max = 0;
//            for (Queue queue : list) {
//                if (queue.isEmpty()) break;
//                int curr = (int) queue.poll();
//                if (max < curr) max = curr;
//            }
//            sum += max;
//        }
//        return sum;
    }
}
