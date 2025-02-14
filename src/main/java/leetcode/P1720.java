package leetcode;

public class P1720 {
    public int[] decode(int[] encoded, int first) {
        int len = encoded.length;
        int[] arr = new int[len + 1];
        arr[0] = first;
        for (int i = 1; i <= len; i++) {
            arr[i] = arr[i - 1] ^ encoded[i - 1];
        }
        return arr;
    }
}
