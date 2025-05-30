package leetcode;

public class P2347 {
    public String bestHand(int[] ranks, char[] suits) {
        if (
                suits[0] == suits[1] &&
                        suits[1] == suits[2] &&
                        suits[2] == suits[3] &&
                        suits[3] == suits[4]
        ) {
            return "Flush";
        }

        int[] freq = new int[14];
        for (int r : ranks) {
            freq[r]++;
        }
        for (int i = 1; i < 14; i++) {
            if (freq[i] > 2) {
                return "Three of a Kind";
            }
        }

        for (int i = 1; i < 14; i++) {
            if (freq[i] > 1) {
                return "Pair";
            }
        }

        return "High Card";
    }
}
