package leetcode;

public class P1208 {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }
        int maxLength = 0;
        int sum = 0;
        int left = 0;
        // Sliding window
        for (int right = 0; right < n; right++) {
            sum += diff[right];
            // Shrink the window
            while (sum > maxCost) {
                sum -= diff[left];
                left++;
            }
            // Update the max length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
