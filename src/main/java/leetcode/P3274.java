package leetcode;

public class P3274 {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int c11 = (coordinate1.charAt(0) - 'a' + 1) % 2;
        int c12 = (coordinate1.charAt(1) - '1' + 1) % 2;
        int c21 = (coordinate2.charAt(0) - 'a' + 1) % 2;
        int c22 = (coordinate2.charAt(1) - '1' + 1) % 2;
        return (c11 + c21) % 2 == (c12 + c22) % 2;
    }
}
