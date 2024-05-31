package leetcode;

public class P1442 {
    public int countTriplets(int[] arr) {
        int len = arr.length;
        int count = 0;
        for (int i=0 ; i<len-1 ; i++) {
            int a = 0;
            for (int j=i ; j<len-1 ; j++) {
                a ^= arr[j];
                int b = 0;
                for (int k=j+1 ; k<len ; k++) {
                    b ^= arr[k];
                    if (a == b) count++;
                }
            }
        }
        return count;
    }
}
