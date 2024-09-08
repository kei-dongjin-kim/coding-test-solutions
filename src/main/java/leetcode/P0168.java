package leetcode;

public class P0168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            // Adjust to 0-based index
            columnNumber -= 1;
            sb.append((char) ('A' + (columnNumber % 26)));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}
