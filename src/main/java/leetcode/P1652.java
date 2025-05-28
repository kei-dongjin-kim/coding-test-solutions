package leetcode;

public class P1652 {
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] res = new int[len];
        if (k == 0) {
            return res;
        }
        for (int i = 0; i < len; i++) {
            for (int j = 1; j <= Math.abs(k); j++) {
                int index = i + len;
                if (k > 0) {
                    index += j;
                } else {
                    index -= j;
                }
                index %= len;
                res[i] += code[index];
            }
        }
        return res;
    }
}
