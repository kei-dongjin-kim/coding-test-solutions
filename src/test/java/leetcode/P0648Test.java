package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class P0648Test {

    @Test
    @DisplayName("dictionary = [cat, ca, c], sentence = cat ran")
    void test1() {
        List<String> dictionary = List.of("cat", "ca", "c");
        String sentence = "cat ran";
        P0648 p0648 = new P0648();
        assert p0648.replaceWords(dictionary, sentence).equals("c ran");
    }
}
