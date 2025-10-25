package leetcode;

public class P3127 {
    public boolean canMakeSquare(char[][] grid) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int b = 0;
                for (int k = i; k < i + 2; k++) {
                    for (int l = j; l < j + 2; l++) {
                        if (grid[k][l] == 'B') {
                            b++;
                        }
                    }
                }
                if (
                    b == 0 ||
                    b == 1 ||
                    b == 3 ||
                    b == 4
                ) {
                    return true;
                }
            }
        }
        return false;
    }
}
