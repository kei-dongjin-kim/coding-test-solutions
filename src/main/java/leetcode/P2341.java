package leetcode;

public class P2341 {
    public int[] numberOfPairs(int[] nums) {
        int[] map = new int[101];
        for (int n : nums) {
            map[n]++;
        }
        int divided = 0;
        int leftover = 0;
        for (int i = 0; i < 101; i++) {
            divided += (map[i] / 2);
            leftover += (map[i] % 2);
        }
        return new int[] {divided, leftover};
    }
}
