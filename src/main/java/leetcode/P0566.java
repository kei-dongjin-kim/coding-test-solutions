package leetcode;

public class P0566 {
  public int[][] matrixReshape(int[][] mat, int r, int c) {
    int matrow = mat.length;
    int matcol = mat[0].length;
    if (matrow * matcol != r * c) {
      return mat;
    }
    int[][] result = new int[r][c];
    int resrow = 0;
    int rescol = 0;
    for (int i=0 ; i<matrow ; i++) {
      for (int j=0 ; j<matcol ; j++) {
        result[resrow][rescol] = mat[i][j];
        rescol++;

        if (rescol == c) {
          rescol = 0;
          resrow++;
        }
      }
    }
    return result;
  }
}
