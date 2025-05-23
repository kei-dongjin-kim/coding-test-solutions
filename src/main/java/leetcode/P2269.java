package leetcode;

public class P2269 {
    public int divisorSubstrings(int num, int k) {
        int count = 0;
        String ns = Integer.toString(num);
        for (int i = 0; i < ns.length() - k + 1; i ++) {
            String tmp = ns.substring(i, i+ k);
            int sub = Integer.parseInt(tmp);
            if (sub != 0 && num % sub == 0) {
                count++;
            }
        }
        return count;
    }
}
