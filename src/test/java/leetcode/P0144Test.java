package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class P0144Test {

    @Test
    @DisplayName("root = [2,1,3]")
    void test1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);

        P0144 solution = new P0144();
        List<Integer> actual = solution.preorderTraversal(root);

        assert(expected.equals(actual));
    }
}
