package leetcode;

public class P2073 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int seconds = 0;

        for (int i=0 ; i<tickets.length ; i++) {
            if (i <= k) {
                seconds += Math.min(tickets[i], tickets[k]);
            } else {
                seconds += Math.min(tickets[i], tickets[k]-1);
            }
        }

        return seconds;
    }
}
