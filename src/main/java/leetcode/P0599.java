package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int[] sum = new int[list1.length];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            int index = getIndexOf(list2, list1[i]);
            if (index == -1) {
                sum[i] = -1;
            } else {
                sum[i] = i + index;
                min = Math.min(min, sum[i]);
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] == min) {
                list.add(list1[i]);
            }
        }
        return list.toArray(new String[0]);
    }

    private int getIndexOf(String[] arr, String s) {
        for (int i = 0; i < arr.length; i++) {
            if (s.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }
}
