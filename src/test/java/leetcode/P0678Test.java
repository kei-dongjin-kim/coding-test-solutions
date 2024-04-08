package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0678Test {

    @Test
    @DisplayName("s = ()")
    void test1() {
        String s = "()";
        assert new P0678().checkValidString(s);
    }

    @Test
    @DisplayName("s = (*)")
    void test2() {
        String s = "(*)";
        assert new P0678().checkValidString(s);
    }

    @Test
    @DisplayName("s = (*))")
    void test3() {
        String s = "(*))";
        assert new P0678().checkValidString(s);
    }

    @Test
    @DisplayName("s = (((**))")
    void test4() {
        String s = "(((**))";
        assert new P0678().checkValidString(s);
    }

    @Test
    @DisplayName("s = (((")
    void test5() {
        String s = "(((";
        assert !new P0678().checkValidString(s);
    }

}
