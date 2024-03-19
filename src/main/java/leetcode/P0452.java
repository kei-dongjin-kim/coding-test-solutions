package leetcode;

import java.util.Arrays;

public class P0452 {
    public int findMinArrowShots(int[][] points) {
        // Sort based on end coordinates
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 1;
        int previous = points[0][1];

        // Count
        for (int i=1 ; i<points.length ; i++) {
            if (points[i][0] > previous) {
                arrows++;
                previous = points[i][1];
            }
        }

        return arrows;
    }
}
