package leetcode;

import org.junit.jupiter.api.Test;

public class P0867Test {
  
  @Test
  void test1() {
    int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
    int[][] expected = {{1,6,11,16}, {2,7,12,17}, {3,8,13,18},{4,9,14,19},{5,10,15,20}};
    P0867 solution = new P0867();
    int[][] actual = solution.transpose(matrix);
    for (int i=0 ; i<actual.length ; i++) {
      for (int j=0 ; j<actual[i].length ; j++) {
        assert expected[i][j] == actual[i][j];
      }
    }
  }
}
