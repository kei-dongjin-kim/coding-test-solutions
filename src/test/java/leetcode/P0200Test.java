package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0200Test {

    @Test
    void test1() {
        char[][] grid = {
            {'1','1','1','0','1'},
            {'1','1','0','1','1'},
            {'1','0','1','0','1'},
            {'1','1','0','1','1'}
        };
        int result = new P0200().numIslands(grid);
        assert result == 3;
    }
}
