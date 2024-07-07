package leetcode;

public class P1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = 0;
        int remaining = 0;
        while (numBottles > 0) {
            count += numBottles;
            int total = numBottles + remaining;
            numBottles = total / numExchange;
            remaining = total % numExchange;
        }
        return count;
    }
}
