package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0959Test {

    @Test
    @DisplayName("grid = [\"//\",\"/ \"]")
    void test1() {
        String[] grid = {"//", "/ "};
        int expected = 3;
        assert expected == new P0959().regionsBySlashes(grid);
    }

}
