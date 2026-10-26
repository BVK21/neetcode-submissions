
class Solution {

    public TreeNode lowestCommonAncestor(
            TreeNode root, TreeNode p, TreeNode q) {

        return dfs(root, p, q);
    }

    private TreeNode dfs(TreeNode root, TreeNode p, TreeNode q) {

        // No target in this empty subtree
        if (root == null) {
            return null;
        }

        // Found one of the targets
        if (root == p || root == q) {
            return root;
        }

        // Ask left and right subtrees
        TreeNode left = dfs(root.left, p, q);
        TreeNode right = dfs(root.right, p, q);

        // Targets found on both sides
        if (left != null && right != null) {
            return root;
        }

        // Pass the result upward
        return left != null ? left : right;
    }
}
