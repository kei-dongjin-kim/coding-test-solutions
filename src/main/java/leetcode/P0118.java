package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i=0 ; i<numRows ; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j=0 ; j<i+1 ; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Add the sum of the two numbers
                    // above the current position in the Pascal's triangle to the current row
                    row.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
            result.add(row);
        }

        return result;
    }
}
