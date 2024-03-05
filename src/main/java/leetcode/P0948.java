package leetcode;

import java.util.Arrays;

public class P0948 {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        int left = 0;
        int right = tokens.length - 1;
        Arrays.sort(tokens);

        while (left <= right) {
            if (power >= tokens[left]) {
                power -= tokens[left];
                left++;
                score++;
            } else if (score > 0 && left < right) {
                score--;
                power += tokens[right];
                right--;
            } else {
                break;
            }
        }
        return score;
    }
}
