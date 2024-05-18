package leetcode;

public class P0979 {
    private int moves;

    public int distributeCoins(TreeNode root) {
        moves = 0;
        dfs(root);
        return moves;
    }

    private int dfs(TreeNode curr) {
        if (curr == null) return 0;

        int leftCoins = dfs(curr.left);
        int rightCoins = dfs(curr.right);

        moves += Math.abs(leftCoins) + Math.abs(rightCoins);

        return (curr.val - 1) + leftCoins + rightCoins;
    }
}
