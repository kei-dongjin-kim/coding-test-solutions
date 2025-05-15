package leetcode;

public class P1758 {
    public int minOperations(String s) {
        int startWith0 = 0;
        int startWith1 = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char flow0 = i % 2 == 0 ? '0' : '1';
            char flow1 = flow0 == '0' ? '1' : '0';
            if (flow0 != arr[i]) {
                startWith0++;
            }
            if (flow1 != arr[i]) {
                startWith1++;
            }
        }
        return Math.min(startWith0, startWith1);
    }
}
