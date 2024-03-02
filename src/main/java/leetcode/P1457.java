package leetcode;

public class P1457 {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode() {}
        public TreeNode(int val) { this.val = val; }
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int result = 0;

    public int pseudoPalindromicPaths (TreeNode root) {
        if (root == null) return 0;
        recursive(root, new int[10]);
        return result;
    }

    private void recursive(TreeNode node, int[] path) {
        if (node == null) return;

        // Count the current node's value
        path[node.val]++;

        // Check if it is a leaf node and if the path is pseudo-palindromic
        if (node.left == null && node.right == null) {
            if (isPseudoPalindromic(path)) result++;
        }

        // Recursive the left and right child nodes
        recursive(node.left, path);
        recursive(node.right, path);

        // Remove the count of the current node's value (backtracking)
        path[node.val]--;
    }

    private boolean isPseudoPalindromic(int[] arr) {
        int oddCount = 0;
        for (int count : arr) {
            if (count%2 == 1) oddCount++;
        }
        return oddCount <= 1;
    }
}
