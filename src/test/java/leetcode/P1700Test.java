package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1700Test {

    @Test
    @DisplayName("students = [1,1,1,0,0,1], sandwiches = [1,0,0,0,1,1]")
    void test1() {
        int[] students = {1, 1, 1, 0, 0, 1};
        int[] sandwiches = {1, 0, 0, 0, 1, 1};
        assert new P1700().countStudents(students, sandwiches) == 3;
    }
}
