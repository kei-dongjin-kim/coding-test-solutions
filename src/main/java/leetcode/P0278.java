package leetcode;

public class    P0278 {
    int badVersion;

    public P0278(int badVersion) {
        this.badVersion = badVersion;
    }

    private boolean isBadVersion(int version) {
        return version >= badVersion;
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int middle = left + ((right - left) / 2);
            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }
}
