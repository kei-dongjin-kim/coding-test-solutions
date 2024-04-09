package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class P1700 {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> queue = new LinkedList<>();
        for (int student : students) {
            queue.add(student);
        }

        for (int sandwich : sandwiches) {
            if (!queue.remove(sandwich)) {
                break;
            }
        }

        return queue.size();
    }
}
