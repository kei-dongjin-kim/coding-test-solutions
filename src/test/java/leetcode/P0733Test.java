package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0733Test {
  
  @Test
  @DisplayName("image = [[1,1,1],[1,1,0],[0,0,1]], sr = 1, sc = 1, color = 2")
  void test1() {
    int[][] image = {{1,1,1},{1,1,0},{0,0,1}};
    int sr = 1;
    int sc = 1;
    int newColor = 2;
    int[][] expected = {{2,2,2},{2,2,0},{0,0,1}};
    int[][] actual = new P0733().floodFill(image, sr, sc, newColor);
    for (int i=0 ; i<actual.length ; i++) {
      for (int j=0 ; j<actual[0].length ; j++) {
        assert(expected[i][j] == actual[i][j]);
      }
    }
  }
}
