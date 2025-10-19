package leetcode;

public class P2660 {
    public int isWinner(int[] player1, int[] player2) {
        int len = player1.length;
        int sum1 = 0, sum2 = 0;
        int p1 = 0, p2 = 0;
        for (int i = 0; i < len; i++) {
            if (p1 > 0) {
                sum1 += player1[i] * 2 ;
                p1--;
            } else {
                sum1 += player1[i] ;
            }
            if (player1[i] == 10) {
                p1 = 2;
            }
            // --
            if (p2 > 0) {
                sum2 += player2[i] * 2 ;
                p2--;
            } else {
                sum2 += player2[i] ;
            }
            if (player2[i] == 10) {
                p2 = 2;
            }
        }
        if (sum1 == sum2) {
            return 0;
        } else {
            return sum1 > sum2 ? 1 : 2;
        }
    }
}
