package leetcode;

public class P2515 {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int count = 0;
        int li = startIndex;
        int ri = startIndex;
        for (int i = 0; i < (n / 2) + 1; i++) {
            if (
                    target.equals(words[li]) ||
                            target.equals(words[ri])
            ) {
                return count;
            }
            li = (li - 1 + n) % n;
            ri = (ri + 1) % n;
            count++;
        }
        return -1;
    }
}
