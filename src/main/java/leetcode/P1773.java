package leetcode;

import java.util.List;

public class P1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> item : items) {
            int index = -1;
            index = switch (ruleKey) {
                case "type" -> 0;
                case "color" -> 1;
                case "name" -> 2;
                default -> index;
            };
            if(item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
