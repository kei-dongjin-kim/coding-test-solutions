package leetcode;

public class P1598 {
    public int minOperations(String[] logs) {
        int depth = 0;

        for (String s : logs) {
            if (s.equals("./")) {
                // Remain in the same folder.
            } else if (s.equals("../") && depth <= 0) {
                // Remain in the main folder.
            } else if (s.equals("../") && depth > 0) {
                depth--;
            } else {
                depth++;
            }
        }

        return depth;
    }
}
