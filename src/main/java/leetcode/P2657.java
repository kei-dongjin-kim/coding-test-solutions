package leetcode;

public class P2657 {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int len = A.length;
        int[] result = new int[len];
        int[] arr = new int[len + 1];
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (++arr[A[i]] >= 2) {
                count++;
            }
            if (++arr[B[i]] >= 2) {
                count++;
            }
            result[i] = count;
        }
        return result;

        // int[] result = new int[A.length];
        // Set<Integer> setA = new HashSet<>();
        // Set<Integer> setB = new HashSet<>();
        // for (int i = 0; i < A.length; i++) {
        //     setA.add(A[i]);
        //     setB.add(B[i]);
        //     Set<Integer> intersection = new HashSet<>(setA);
        //     intersection.retainAll(setB);
        //     result[i] = intersection.size();
        // }
        // return result;
    }
}
