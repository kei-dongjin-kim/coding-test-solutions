package leetcode;

public class TreeNode {
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

    public static void assertTree(TreeNode expected, TreeNode actual) {
        if (expected == null && actual == null) {
            return;
        }

        // If one of them is null but not both, they are not equal
        if (expected == null || actual == null) {
            throw new AssertionError("Trees are not equal");
        }

        // If the values are not equal, the trees are not equal
        if (expected.val != actual.val) {
            throw new AssertionError("Trees are not equal");
        }

        // Recursively check the left and right subtrees
        assertTree(expected.left, actual.left);
        assertTree(expected.right, actual.right);
    }
}
