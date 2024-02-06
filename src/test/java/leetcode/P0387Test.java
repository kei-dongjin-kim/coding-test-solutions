package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0387Test {

    @Test
    @DisplayName("s = leetcode")
    void firstUniqChar_Test1() {
        String s = "leetcode";
        int expected = 0;
        int result = new P0387().firstUniqChar(s);
        assert (expected == result);
    }

    @Test
    @DisplayName("s = loveleetcode")
    void firstUniqChar_Test2() {
        String s = "loveleetcode";
        int expected = 2;
        int result = new P0387().firstUniqChar(s);
        assert (expected == result);
    }

    @Test
    @DisplayName("s = aabb")
    void firstUniqChar_Test3() {
        String s = "aabb";
        int expected = -1;
        int result = new P0387().firstUniqChar(s);
        assert (expected == result);
    }
}
