package leetcode;

public class P0664 {

    public int strangePrinter(String s) {
        int len = s.length();
        int[][] dp = new int[len][len];

        for (int i = len - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i][j - 1];
                } else {
                    int min = Integer.MAX_VALUE;
                    for (int k = i; k < j; k++) {
                        // Calculate the minimum number of turns needed to print the substring s[i:j]
                        // by considering all possible split points k between i and j.
                        // dp[i][k] represents the minimum turns needed to print the substring s[i:k].
                        // dp[k + 1][j] represents the minimum turns needed to print the substring s[k+1:j].
                        // The sum of these two values gives the total turns needed if we split the substring at k.
                        // We take the minimum of the current min value and the calculated turns for each k.
                        min = Math.min(min, dp[i][k] + dp[k + 1][j]);
                    }
                    dp[i][j] = min;
                }
            }
        }
        return dp[0][len - 1];
    }

//    public int strangePrinter(String s) {
//        s = removeDuplicates(s);
//        int len = s.length();
//        Integer[][] memo = new Integer[len][len];
//        return minimumTurns(0, len - 1, s, memo);
//    }
//
//    private int minimumTurns(int start, int end, String s, Integer[][] memo) {
//        if (start > end)
//            return 0;
//
//        if (memo[start][end] != null)
//            return memo[start][end];
//
//        int minTurns = 1 + minimumTurns(start + 1, end, s, memo);
//
//        for (int k = start + 1 ; k <= end ; k++) {
//            if (s.charAt(k) == s.charAt(start)) {
//                int turnsWithMatch = minimumTurns(start, k - 1, s, memo) +
//                        minimumTurns(k + 1, end, s, memo);
//                minTurns = Math.min(minTurns, turnsWithMatch);
//            }
//        }
//
//        return memo[start][end] = minTurns;
//    }
//
//    private String removeDuplicates(String s) {
//        StringBuilder uniqueChars = new StringBuilder();
//        int i = 0;
//        while (i < s.length()) {
//            char currentChar = s.charAt(i);
//            uniqueChars.append(currentChar);
//            while (i < s.length() && s.charAt(i) == currentChar) {
//                i++;
//            }
//        }
//        return uniqueChars.toString();
//    }

}
