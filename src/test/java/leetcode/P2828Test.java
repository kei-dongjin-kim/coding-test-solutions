package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P2828Test {

    @Test
    void test1() {
        List<String> words = new ArrayList<>();
        words.add("abc");
        words.add("def");
        words.add("ghi");
        String s = "adg";
        boolean expected = true;
        P2828 solution = new P2828();
        boolean actual = solution.isAcronym(words, s);
        assert expected == actual;
    }
}
