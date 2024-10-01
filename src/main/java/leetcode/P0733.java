package leetcode;

public class P0733 {
  
  public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    int[][] visited = new int[image.length][image[0].length];
    helper(image, sr, sc, color, visited);
    return image;
  }

  public int[][] helper(int[][] image, int sr, int sc, int color, int[][] visited) {
    if (visited[sr][sc] == 1) {
      return image;
    }

    visited[sr][sc] = 1;

    if (sr + 1 < image.length && image[sr][sc] == image[sr + 1][sc]) {
      helper(image, sr + 1, sc, color, visited);
    }
    if (0 <= sr - 1 && image[sr][sc] == image[sr - 1][sc]) {
      helper(image, sr - 1, sc, color, visited);
    }
    if (sc + 1 < image[0].length && image[sr][sc] == image[sr][sc + 1]) {
      helper(image, sr, sc + 1, color, visited);
    }
    if (0 <= sc - 1 && image[sr][sc] == image[sr][sc - 1]) {
      helper(image, sr, sc - 1, color, visited);
    }

    image[sr][sc] = color;

    return image;
  }
}
