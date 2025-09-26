package leetcode;

public class P3206 {
    public int numberOfAlternatingGroups(int[] colors) {
        int count = 0;
        for (int i = 0; i < colors.length; i++) {
            int left = -1;
            int right = -1;
            if (i == 0) {
                left = colors[colors.length - 1];
                right = colors[i + 1];
            } else if (i == colors.length - 1) {
                left = colors[i - 1];
                right = colors[0];
            } else {
                left = colors[i - 1];
                right = colors[i + 1];
            }
            if (
                    left == right &&
                            left != colors[i]
            ) {
                count++;
            }
        }
        return count;
    }
}
