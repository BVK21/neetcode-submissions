class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();

            // Step 1: Swap children
            TreeNode temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;

            // Step 2: Add existing children
            if (curr.left != null) {
                queue.offer(curr.left);
            }

            if (curr.right != null) {
                queue.offer(curr.right);
            }
        }

        return root;
    }
}