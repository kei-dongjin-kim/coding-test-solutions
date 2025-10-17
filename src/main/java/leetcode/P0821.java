package leetcode;

public class P0821 {
    public int[] shortestToChar(String s, char c) {
        int len = s.length();
        int left = -1;
        int right = 0;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == c) {
                right = i;
                if (left == -1) {
                    for (int j = i - 1; j >= 0; j--) {
                        res[j] = i - j;
                    }
                } else {
                    left++;
                    right--;
                    int curr = 1;
                    while (left <= right) {
                        res[left] = curr;
                        res[right] = curr;
                        left++;
                        right--;
                        curr++;
                    }
                }
                res[i] = 0;
                left = i;
            }
        }
        if (left < len - 1) {
            for (int i = left + 1; i < len; i++) {
                res[i] = i - left;
            }
        }
        return res;
    }
}
