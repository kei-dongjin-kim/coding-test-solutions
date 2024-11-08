package leetcode;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

public class P0830Test {
  
  @Test
  void test1() {
    String s = "abcccdddeeefgh";
    List<List<Integer>> expected = Arrays.asList(Arrays.asList(2, 4), Arrays.asList(5, 7), Arrays.asList(8, 10));
    P0830 solution = new P0830();
    List<List<Integer>> actual = solution.largeGroupPositions(s);
    for (int i=0 ; i<expected.size() ; ++i) {
      for (int j=0 ; j<2 ; j++) {
        assert expected.get(i).get(j) == actual.get(i).get(j);
      }
    }
  }
}
