package leetcode;

public class P2042 {
    public boolean areNumbersAscending(String s) {

        String[] wordsArray = s.split(" ");

        int previousNumber = -1;
        int currentNumber = -1;
        for (String word : wordsArray) {
            if (47 < word.charAt(0) && word.charAt(0) < 58) {
                currentNumber = Integer.parseInt(word);
                if (previousNumber >= currentNumber) return false;
                previousNumber = currentNumber;
            }
        }

        return true;
    }
}
