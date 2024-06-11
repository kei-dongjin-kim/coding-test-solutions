package leetcode;

import java.util.*;

public class P1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        Map<Integer, Integer> map = new TreeMap<>();
        for (int a : arr1) map.put(a, map.getOrDefault(a, 0) + 1);
        int index = 0;
        // Insert arr2 elements first
        for (int a : arr2) {
            int count = map.remove(a);
            for (int i=0 ; i<count ; i++) {
                result[index] = a;
                index++;
            }
        }
        // Insert remaining elements
        for (int k : map.keySet()) {
            int count = map.get(k);
            for (int i=0 ; i<count ; i++) {
                result[index] = k;
                index++;
            }
        }
        return result;
    }
}
