package leetcode;

import java.util.List;
import java.util.ArrayList;

public class P0094 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    private void helper(TreeNode curr, List<Integer> res) {
        if (curr != null) {
            helper(curr.left, res);
            res.add(curr.val);
            helper(curr.right, res);
        }
    }
}
