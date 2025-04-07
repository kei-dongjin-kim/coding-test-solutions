package leetcode;

public class P2678 {
    public int countSeniors(String[] details) {
        int count = 0;
        for (String s : details) {
            String sub = s.substring(11, 13);
            int age = Integer.parseInt(sub);
            if (age > 60) {
                count++;
            }
        }
        return count;
    }
}
