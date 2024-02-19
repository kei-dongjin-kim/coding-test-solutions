package leetcode;

import java.util.*;

class Pair {
    public int key;
    public int value;

    public Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class P1481 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
//        Arrays.sort(arr);


        Map<Integer, Integer> map = new HashMap<>();
        for (int number : arr) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        List<Pair> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            list.add(new Pair(key, map.get(key)));
        }
        list.sort(Comparator.comparingInt((Pair t) -> t.value).reversed());
        while (k > 0) {
            Pair curr = list.getLast();
            int tmp = curr.value - k;

            if (tmp > 0) {
                curr.value = tmp;
                k = 0;
            } else {
                list.removeLast();
                k -= curr.value;
            }
        }

        return list.size();
    }
}
