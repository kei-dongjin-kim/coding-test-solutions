package leetcode;

import java.util.stream.IntStream;

public class P1482 {
    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) return -1;

        int start = 0;
        int end = 0;
        for (int day : bloomDay) end = Math.max(end, day);

        int minDays = -1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (getNumOfBouquets(bloomDay, mid, k) >= m) {
                minDays = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return minDays;
    }

    private int getNumOfBouquets(int[] bloomDay, int mid, int k) {
        int numOfBouquets = 0;
        int adjacent = 0;

        // Find the number of bouquets that can be made with the current mid value
        for (int j : bloomDay) {
            // If the current flower blooms before or on the mid day, increment the adjacent counter
            if (j <= mid) {
                adjacent++;
            } else {
                adjacent = 0;
            }

            // If the adjacent counter reaches k, increment the number of bouquets and reset the adjacent counter
            if (adjacent >= k) {
                numOfBouquets++;
                adjacent -= k;
            }
        }

        return numOfBouquets;
    }
}
