package leetcode;

public class P0552 {
    public int checkRecord(int n) {
        int MOD = 1_000_000_007;
        int [][][] dp = new int[n+1][2][3];
        dp[0][0][0] = 1;
        // Iterate over the length of the record
        for (int len=0 ; len<n ; ++len) {
            // Iterate over the total number of absences
            for (int totalAbsences=0 ; totalAbsences<=1 ; ++totalAbsences) {
                // Iterate over the number of consecutive lates
                for (int consecutiveLates=0 ;consecutiveLates<=2 ; ++consecutiveLates) {
                    // If the student is present, the number of consecutive lates is reset to 0
                    dp[len+1][totalAbsences][0] = (
                        dp[len + 1][totalAbsences][0] +
                        dp[len][totalAbsences][consecutiveLates]
                    ) % MOD;
                    // If the student is absent, the number of total absences is increased by 1
                    if (totalAbsences < 1) {
                        dp[len + 1][totalAbsences+1][0] =(
                            dp[len + 1][totalAbsences + 1][0] +
                            dp[len][totalAbsences][consecutiveLates]
                        ) % MOD;
                    }
                    // If the student is late, the number of consecutive lates is increased by 1
                    if (consecutiveLates < 2) {
                        dp[len + 1][totalAbsences][consecutiveLates + 1] = (
                            dp[len + 1][totalAbsences][consecutiveLates + 1] +
                            dp[len][totalAbsences][consecutiveLates]
                        ) % MOD;
                    }
                }
            }
        }
        int count = 0;
        // Sum up all the valid records
        for (int totalAbsences=0 ; totalAbsences<=1 ; ++totalAbsences) {
            for (int consecutiveLates=0 ; consecutiveLates<=2 ; ++consecutiveLates) {
                count = (count + dp[n][totalAbsences][consecutiveLates]) % MOD;
            }
        }
        return count;
    }
}
