package leetcode;

import java.util.Arrays;

public class P1552 {
    public int maxDistance(int[] position, int m) {
        int answer = 0;
        int n = position.length;
        Arrays.sort(position);

        int low = 1;
        // Maximum distance between two balls
        int high = (int) Math.ceil(position[n - 1] / (m - 1.0));
        // Binary search
        while (low <= high) {
            // Mid value
            int mid = low + (high - low) / 2;
            // Check if balls can be placed
            if (canPlaceBalls(mid, position, m)) {
                // Update answer
                answer = mid;
                // Move to right
                low = mid + 1;
            } else {
                // Move to left
                high = mid - 1;
            }
        }

        return answer;
    }
    private boolean canPlaceBalls(int x, int[] position, int m) {
        int prevBallPos = position[0];
        int ballsPlaced = 1;

        // Place balls
        for (int i=1 ; i<position.length && ballsPlaced < m ; ++i) {
            int currPos = position[i];
            if (currPos - prevBallPos >= x) {
                ballsPlaced += 1;
                prevBallPos = currPos;
            }
        }

        // Check if all balls are placed
        return ballsPlaced == m;
    }
}
