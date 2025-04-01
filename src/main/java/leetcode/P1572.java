package leetcode;

public class P1572 {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int left = 0;
        int right = mat.length - 1;
        for (int[] m : mat) {
            if (left == right) {
                sum += m[left];
            } else {
                sum += m[left];
                sum += m[right];
            }
            left++;
            right--;
        }
        return sum;
    }
}
