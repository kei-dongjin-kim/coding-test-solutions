package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P0145Test {

    @Test
    @DisplayName("root = [2,1,3]")
    void test1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(1);

        P0145 solution = new P0145();
        List<Integer> actual = solution.postorderTraversal(root);

        assert(expected.equals(actual));
    }
}
