package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0079Test {

    @Test
    @DisplayName("board = [[A,B,C,E],[S,F,C,S],[A,D,E,E]], word = ABCCED")
    void exist_Test1() {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCCED";
        boolean expected = true;
        boolean actual = new P0079().exist(board, word);
        assert(expected == actual);
    }
}
