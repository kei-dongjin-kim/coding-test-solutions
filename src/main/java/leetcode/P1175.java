package leetcode;

import java.util.Arrays;

public class P1175 {
  static int MOD = 1_000_000_007;
  public int numPrimeArrangements(int n) {
    boolean[] prime = new boolean[n + 1];
    Arrays.fill(prime, 2, n + 1, true);
    for (int i = 2; i * i <= n; i++) {
      if (prime[i]) {
        for (int j = i * i; j <= n; j += i) {
          prime[j] = false;
        }
      }
    }
    int count = 0;
    for (int i = 0; i <= n; i++) {
      if (prime[i]) {
        count++;
      }
    }
    long result = 1;
    for (int i = 2; i <= count; i++) {
      result = (result * i) % MOD;
    }
    for (int i = 2; i<= n - count; i++) {
      result = (result * i) % MOD;
    }
    return (int) result;
  }
}
