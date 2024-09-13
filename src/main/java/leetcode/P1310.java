package leetcode;

public class P1310 {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int len = queries.length;
        int[] result = new int[len];
        for (int i=0 ; i<len ; i++) {
            int xor = arr[queries[i][0]];
            for (int j=queries[i][0]+1 ; j<=queries[i][1] ; j++) {
                xor ^= arr[j];
            }
            result[i] = xor;
        }
        return result;
    }
}
