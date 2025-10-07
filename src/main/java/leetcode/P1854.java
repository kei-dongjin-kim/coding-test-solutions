package leetcode;

public class P1854 {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[2051];
        int max = 0;
        for (int[] log : logs) {
            arr[log[0]]++;
            arr[log[1]]--;
        }
        int ans = 1950;
        for (int i = 1950; i < 2051; i++) {
            arr[i] = arr[i] + arr[i - 1];
            if (arr[i] > max) {
                max = arr[i];
                ans = i;
            }
        }
        return ans;
    }
}
