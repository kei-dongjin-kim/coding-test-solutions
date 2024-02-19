package leetcode;

import java.util.*;

public class P0506 {
    public String[] findRelativeRanks(int[] score) {
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> score[b] - score[a]);
        for (int i=0 ; i<score.length ; i++) {
            queue.add(i);
        }
        String[] result = new String[score.length];
        int j = 0;
        while (!queue.isEmpty()) {
            int i = queue.poll();
            if (j == 0) {
                result[i] = "Gold Medal";
            } else if (j == 1) {
                result[i] = "Silver Medal";
            } else if (j == 2) {
                result[i] = "Bronze Medal";
            } else {
                result[i] = String.valueOf(j + 1);
            }
            j++;
        }
        return result;

//        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i=0 ; i<score.length ; i++) {
//            queue.add(score[i]);
//            map.put(score[i], i);
//        }
//        String[] result = new String[score.length];
//        for (int j=0 ; j<score.length ; j++) {
//            int s = queue.poll();
//            int i = map.get(s);
//            if (j == 0) {
//                result[i] = "Gold Medal";
//            } else if (j == 1) {
//                result[i] = "Silver Medal";
//            } else if (j == 2) {
//                result[i] = "Bronze Medal";
//            } else {
//                result[i] = String.valueOf(j + 1);
//            }
//        }
//        return result;
    }
}
