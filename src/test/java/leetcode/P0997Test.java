package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0997Test {

    @Test
    @DisplayName("n = 2, trust = [[1,2]]")
    void findJudge_Test1() {
        int n = 2;
        int[][] trust = {{1,2}};
        int expected = 2;
        int actual =  new P0997().findJudge(n, trust);
        assert(expected == actual);
    }

    @Test
    @DisplayName("n = 3, trust = [[1,3],[2,3]]")
    void findJudge_Test2() {
        int n = 3;
        int[][] trust = {{1,3},{2,3}};
        int expected = 3;
        int actual =  new P0997().findJudge(n, trust);
        assert(expected == actual);
    }

    @Test
    @DisplayName("n = 3, trust = [[1,3],[2,3],[3,1]]")
    void findJudge_Test3() {
        int n = 3;
        int[][] trust = {{1,3},{2,3},{3,1}};
        int expected = -1;
        int actual =  new P0997().findJudge(n, trust);
        assert(expected == actual);
    }

    @Test
    @DisplayName("n = 3, trust = [[1,2],[2,3]]")
    void findJudge_Test4() {
        int n = 3;
        int[][] trust = {{1,2},{2,3}};
        int expected = -1;
        int actual =  new P0997().findJudge(n, trust);
        assert(expected == actual);
    }

    @Test
    @DisplayName("n = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]")
    void findJudge_Test5() {
        int n = 4;
        int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        int expected = 3;
        int actual =  new P0997().findJudge(n, trust);
        assert(expected == actual);
    }
}
