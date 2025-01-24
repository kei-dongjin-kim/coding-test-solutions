package leetcode;

public class P1678 {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int len = command.length();
        int i = 0;
        while (i < len) {
            if (command.charAt(i) == 'G') {
                sb.append("G");
                i += 1;
            } else if (command.substring(i, i + 2).equals("()")) {
                sb.append("o");
                i += 2;
            } else if (command.substring(i, i + 4).equals("(al)")) {
                sb.append("al");
                i += 4;
            }
        }
        return sb.toString();
    }
}
