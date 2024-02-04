package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2037Test {

    @Test
    @DisplayName("seats = [3,1,5], students = [2,7,4]")
    void minMovesToSeat_Test1() {
        int[] seats = {3,1,5};
        int[] students = {2,7,4};
        int expected = 4;
        assert new P2037().minMovesToSeat(seats, students) == expected;
    }

    @Test
    @DisplayName("seats = [4,1,5,9], students = [1,3,2,6]")
    void minMovesToSeat_Test2() {
        int[] seats = {4,1,5,9};
        int[] students = {1,3,2,6};
        int expected = 7;
        assert new P2037().minMovesToSeat(seats, students) == expected;
    }

    @Test
    @DisplayName("seats = [2,2,6,6], students = [1,3,2,6]")
    void minMovesToSeat_Test3() {
        int[] seats = {2,2,6,6};
        int[] students = {1,3,2,6};
        int expected = 4;
        assert new P2037().minMovesToSeat(seats, students) == expected;
    }
}
