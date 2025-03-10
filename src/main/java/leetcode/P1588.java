package leetcode;

public class P1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int len = arr.length;
        for (int i = 0; i < len; i = i + 2) {
            for (int j = 0; j + i < len; j++) {
                for (int k = j; k < j + i + 1; k++) {
                    sum += arr[k];
                }
            }
        }
        return sum;
    }
}
