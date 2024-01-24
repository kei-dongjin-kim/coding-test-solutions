package leetcode;

import java.util.List;

public class P1239 {
    int result = 0;

    public int maxLength(List<String> arr) {
        backtrack(arr, "", 0);
        return result;
    }

    private void backtrack(List<String> arr, String curr, int idx) {
        boolean isUnique = isUniqueChars(curr);

        if (isUnique) {
            result = Math.max(result, curr.length());
        }

        if (idx == arr.size() || !isUnique) {
            return;
        }

        for (int i=idx ; i<arr.size() ; i++) {
            backtrack(arr, curr + arr.get(i), i+1);
        }
    }

    private boolean isUniqueChars(String s) {
        int[] alphabet = new int[26];
        for (char c : s.toCharArray()) {
            if (alphabet[c - 'a']++ > 0) return false;
        }
        return true;
    }
}
