package leetcode;

public class P1640 {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int index = 0;
        int len = pieces.length;
        boolean[] map = new boolean[len];
        while (index < arr.length) {
            int found = -1;
            for (int b = 0; b < pieces.length; b++) {
                if (!map[b]) {
                    if (arr[index] == pieces[b][0]) {
                        found = b;
                        map[b] = true;
                    }
                }
            }
            if (found == -1) {
                return false;
            } else {
                for (int c = 0; c < pieces[found].length; c++) {
                    if (arr[index] == pieces[found][c]) {
                        index++;
                    } else {
                        return false;
                    }
                }
            }
        }
        return arr.length == index;
    }
}
