package leetcode;

public class P1184 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int left = start;
        int left_sum = 0;
        int right = start;
        int right_sum = 0;
        int len = distance.length;
        while (left != destination || right != destination) {
            if (left != destination) {
                if (left == 0) {
                    left = len - 1;
                } else {
                    left--;
                }
                left_sum += distance[left];
            }
            if (right != destination) {
                right_sum += distance[right];
                if (right == len - 1) {
                    right = 0;
                } else {
                    right++;
                }
            }
        }
        return Math.min(left_sum, right_sum);
    }
}
