package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0787Test {

    @Test
    @DisplayName("n = 4, flights = [[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]], src = 0, dst = 3, k = 1")
    void findCheapestPrice_Test1() {
        int n = 4;
        int[][] flights = new int[][] { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };
        int src = 0;
        int dst = 3;
        int k = 1;
        int expected = 700;
        int actual = new P0787().findCheapestPrice(n, flights, src, dst, k);
        assert (actual == expected);
    }

    @Test
    @DisplayName("n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 1")
    void findCheapestPrice_Test2() {
        int n = 3;
        int[][] flights = new int[][] { { 0, 1, 100 }, { 1, 2, 100 }, { 0, 2, 500 } };
        int src = 0;
        int dst = 2;
        int k = 1;
        int expected = 200;
        int actual = new P0787().findCheapestPrice(n, flights, src, dst, k);
        assert (actual == expected);
    }

    @Test
    @DisplayName("n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 0")
    void findCheapestPrice_Test3() {
        int n = 3;
        int[][] flights = new int[][] { { 0, 1, 100 }, { 1, 2, 100 }, { 0, 2, 500 } };
        int src = 0;
        int dst = 2;
        int k = 0;
        int expected = 500;
        int actual = new P0787().findCheapestPrice(n, flights, src, dst, k);
        assert (actual == expected);
    }

    @Test
    @DisplayName("n = 3, flights = [[0,1,2],[1,2,1],[2,0,10]], src = 1, dst = 2, k = 1")
    void findCheapestPrice_Test4() {
        int n = 3;
        int[][] flights = new int[][] { { 0, 1, 2 }, { 1, 2, 1 }, { 2, 0, 10 } };
        int src = 1;
        int dst = 2;
        int k = 1;
        int expected = 1;
        int actual = new P0787().findCheapestPrice(n, flights, src, dst, k);
        assert (actual == expected);
    }
}
