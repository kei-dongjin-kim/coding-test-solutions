package leetcode;

public class P2283 {
    public boolean digitCount(String num) {
        int[] arr = new int[11];
        int len = num.length();
        for (int i = 0; i < len; i++) {
            int curr = num.charAt(i) - '0';
            arr[curr]++;
        }
        for (int i = 0; i < len; i++) {
            int curr = num.charAt(i) - '0';
            if (curr != arr[i]) {
                return false;
            }
        }
        return true;
    }
}
