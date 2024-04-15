package leetcode;

public class P0404 {
    public int sumOfLeftLeaves(TreeNode root) {
        return traceLeftLeaves(root, false);
    }

    public int traceLeftLeaves(TreeNode node, boolean isLeft) {
        if (node == null) return 0;
        int sum = 0;
        if (isLeft && node.left == null && node.right == null) {
            return node.val;
        } else {
            sum += traceLeftLeaves(node.left, true);
            sum += traceLeftLeaves(node.right, false);
        }
        return sum;
    }
}
