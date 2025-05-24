package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P2363 {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ret = new ArrayList<>();
        for (int[] item : items1) {
            boolean flag = true;
            for (List<Integer> r : ret) {
                if (r.get(0) == item[0]) {
                    flag = false;
                    int tmp = r.get(1) + item[1];
                    r.set(1, tmp);
                }
            }
            if (flag) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(item[0]);
                tmp.add(item[1]);
                ret.add(tmp);
            }
        }
        for (int[] item : items2) {
            boolean flag = true;
            for (List<Integer> r : ret) {
                if (r.get(0) == item[0]) {
                    flag = false;
                    int tmp = r.get(1) + item[1];
                    r.set(1, tmp);
                }
            }
            if (flag) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(item[0]);
                tmp.add(item[1]);
                ret.add(tmp);
            }
        }
        ret.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));
        return ret;
    }
}
