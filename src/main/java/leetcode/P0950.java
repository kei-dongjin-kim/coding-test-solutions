package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P0950 {
    public int[] deckRevealedIncreasing(int[] deck) {
        int len = deck.length;
        int[] result = new int[len];
        Queue<Integer> list = new LinkedList<>();
        for (int i=0; i<len ; i++) list.add(i);
        Arrays.sort(deck);

        for (int j : deck) {
            if (!list.isEmpty()) result[list.poll()] = j;
            if (!list.isEmpty()) list.add(list.poll());
        }

        return result;
    }
}
