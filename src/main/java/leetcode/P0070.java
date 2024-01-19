package leetcode;

public class P0070 {
    public int climbStairs(int n) {

        // n =  1, result =  1
        // n =  2, result =  2
        // n =  3, result =  3 =  2 +  1
        // n =  4, result =  5 =  3 +  2
        // n =  5, result =  8 =  5 +  3
        // n =  6, result = 13 =  8 +  5
        // n =  7, result = 21 = 13 +  8
        // n =  8, result = 34 = 21 + 13
        // n =  9, result = 55 = 34 + 21
        // n = 10, result = 89 = 55 + 34

        int result = 1;
        int prev = 0;
        int temp = 0;
        for (int i=1 ; i<=n ; i++) {
            temp = result;
            result += prev;
            prev = temp;
        }

        return result;
    }
}
