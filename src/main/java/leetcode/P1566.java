package leetcode;

public class P1566 {
    public boolean containsPattern(int[] arr, int m, int k) {
        int len = arr.length;
        if (len < m * k) {
            return false;
        }
        for (int i = 0; i < len - (m * k) + 1; i++) {
            boolean flag = true;
            for (int j = i + m; j < i + (m * k); j++) {
                if (arr[i + ((j - i) % m)] != arr[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }
}
