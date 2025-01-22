package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P2942Test {

    @Test
    void test1() {
        String[] nums = new String[] {"apple", "banana", "papaya", "lemon"};
        char x = 'a';
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        P2942 solution = new P2942();
        List<Integer> actual = solution.findWordsContaining(nums, x);
        for (int i = 0; i < actual.size(); i++) {
            assert expected.get(i).equals(actual.get(i));
        }
    }
}
