package leetcode;

public class P2582 {
    public int passThePillow(int n, int time) {
        boolean flag = true;
        int index = 1;
        for (int i = 0; i < time; i++) {
            if (
                (index == n && flag) ||
                (index == 1 && !flag)
            ) {
                flag = !flag;
            }
            if (flag) {
                index++;
            } else {
                index--;
            }
        }
        return index;
    }
}
