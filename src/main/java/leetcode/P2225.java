package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class P2225 {
    public List<List<Integer>> findWinners(int[][] matches) {

        HashMap<Integer, Integer> lostCount = new HashMap<>();
        int winner = -1;
        int loser = -1;
        List<Integer> answer0 = new ArrayList<>();
        List<Integer> answer1 = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int[] match : matches) {
            winner = match[0];
            loser = match[1];

            lostCount.put(winner, lostCount.getOrDefault(winner, 0));
            lostCount.put(loser, lostCount.getOrDefault(loser, 0) + 1);
        }

        for (int key : lostCount.keySet()) {
            if (lostCount.get(key).equals(0)) answer0.add(key);
            if (lostCount.get(key).equals(1)) answer1.add(key);
        }

        answer0.sort(Comparator.naturalOrder());
        answer1.sort(Comparator.naturalOrder());

        result.add(answer0);
        result.add(answer1);

        return result;
    }
}
