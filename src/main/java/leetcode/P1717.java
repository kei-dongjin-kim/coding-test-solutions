package leetcode;

public class P1717 {
    public int maximumGain(String s, int x, int y) {
        StringBuilder sb = new StringBuilder(s);
        int score = 0;

        if (x > y) {
            score += removeSubstring(sb, "ab", x);
            score += removeSubstring(sb, "ba", y);
        } else {
            score += removeSubstring(sb, "ba", y);
            score += removeSubstring(sb, "ab", x);
        }

        return score;
    }
    private int removeSubstring(
        StringBuilder inputString,
        String targetSubstring,
        int points
    ) {
        int score = 0;
        int writeIndex = 0;

        // Write the characters to the inputString, and remove the targetSubstring
        for (int i=0 ; i<inputString.length() ; i++) {
            // Write the character to the inputString
            inputString.setCharAt(writeIndex++, inputString.charAt(i));

            // Check if the targetSubstring is present
            if (
                writeIndex > 1 &&
                inputString.charAt(writeIndex - 2) == targetSubstring.charAt(0) &&
                inputString.charAt(writeIndex - 1) == targetSubstring.charAt(1)
            ) {
                // Remove the targetSubstring
                writeIndex -= 2;
                score += points;
            }
        }

        // Set the length of the inputString to the writeIndex
        inputString.setLength(writeIndex);

        return score;
    }
}
