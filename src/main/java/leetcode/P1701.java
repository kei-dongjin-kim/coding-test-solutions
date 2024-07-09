package leetcode;

public class P1701 {
    public double averageWaitingTime(int[][] customers) {
        double sum = 0;
        int timeToFinish = 0;

        for (int[] arr : customers) {
            timeToFinish = Math.max(arr[0], timeToFinish) + arr[1];
            sum += timeToFinish - arr[0];
        }

        return (double) sum / customers.length;
    }
}
