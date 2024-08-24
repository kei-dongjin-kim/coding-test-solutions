package leetcode;

public class P0564 {
    public String nearestPalindromic(String n) {
        long num = Long.parseLong(n);
        long a = previousPalindrome(num);
        long b = nextPalindrome(num);
        if (Math.abs(a - num) <= Math.abs(b - num)) {
            return Long.toString(a);
        }
        return Long.toString(b);
    }

    private long convert(long num) {
        String s = Long.toString(num);
        int len = s.length();
        int left = (len - 1) / 2;
        int right = len / 2;
        char[] sArray = s.toCharArray();
        while (left >= 0) {
            sArray[right++] = sArray[left--];
        }
        return Long.parseLong(new String(sArray));
    }

    private long previousPalindrome(long num) {
        long left = 0;
        long right = num;
        long ans = Long.MIN_VALUE;
        while (left <= right) {
            long mid = (right - left) / 2 + left;
            long palin = convert(mid);
            if (palin < num) {
                ans = palin;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    private long nextPalindrome(long num) {
        long left = num;
        long right = (long) 1e18;
        long ans = Long.MIN_VALUE;
        while (left <= right) {
            long mid = (right - left) / 2 + left;
            long palin = convert(mid);
            if (palin > num) {
                ans = palin;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

}
