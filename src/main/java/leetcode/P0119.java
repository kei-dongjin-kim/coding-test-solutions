package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> temp = new ArrayList<>();

        for (int i=0 ; i<rowIndex+1 ; i++) {
            List<Integer> curr = new ArrayList<>();
            for (int j=0 ; j<i+1 ; j++) {
                if (j == 0 || j == i) {
                    curr.add(1);
                } else {
                    curr.add(temp.get(j-1) + temp.get(j));
                }
            }
            temp = curr;
        }

        return temp;
    }
}
