package leetcode;

public class P3477 {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int len = fruits.length;
        for (int fruit : fruits) {
            for (int b = 0; b < len; b++) {
                if (fruit <= baskets[b]) {
                    baskets[b] = -1;
                    break;
                }
            }
        }
        int count = 0;
        for (int i : baskets) {
            if (i != -1) {
                count++;
            }
        }
        return count;
    }
}
