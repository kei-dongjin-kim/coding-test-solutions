package leetcode;

public class P2591 {
    public int distMoney(int money, int children) {
        money -= children;
        if (money < 0) {
            return -1;
        }
        int count = 0;
        while (money >= 7 && children > 0) {
            money -= 7;
            children--;
            count++;
        }
        if (children == 0 && money > 0) {
            count--;
        }
        if (children == 1 && money == 3) {
            count--;
        }
        return count;
    }
}
