package leetcode;

public class P1299 {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        int max = 0;
        result[len - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            max = Math.max(max, arr[i + 1]);
            result[i] = max;
        }
        return result;
    }
}
