package leetcode;

public class P0623 {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return traceTree(root, val, depth, 1, true);
    }
    public TreeNode traceTree(TreeNode node, int val, int depth, int currDepth, boolean isLeft) {
        if (depth == currDepth) {
            if (isLeft) {
                return new TreeNode(val, node, null);
            } else {
                return new TreeNode(val, null, node);
            }
        } else {
            if (node.left != null)
                node.left = traceTree(node.left, val, depth, currDepth + 1, true);
            else if (depth == currDepth + 1)
                node.left = traceTree(null, val, depth, currDepth + 1, true);
            if (node.right != null)
                node.right = traceTree(node.right, val, depth, currDepth + 1, false);
            else if (depth == currDepth + 1)
                node.right = traceTree(null, val, depth, currDepth + 1, false);
        }
        return node;
    }
}
