package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        int min = arr[len - 1] - arr[0];
        for (int i = 0; i < len - 1; i++) {
            int abs = Math.abs(arr[i] - arr[i + 1]);
            min = Math.min(min, abs);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < len - 1; i++) {
            if (min == Math.abs(arr[i] - arr[i + 1])) {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i + 1]);
                result.add(list);
            }
        }
        return result;
    }
}
