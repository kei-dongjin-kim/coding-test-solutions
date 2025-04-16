package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P1436 {
    public String destCity(List<List<String>> paths) {
        List<String> list = new ArrayList<>();
        for (List<String> p : paths) {
            list.add(p.get(1));
        }
        for (List<String> p : paths) {
            list.remove(p.get(0));
        }
        return list.get(0);
    }
}
