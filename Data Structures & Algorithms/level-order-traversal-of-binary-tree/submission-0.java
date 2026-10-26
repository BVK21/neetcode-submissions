
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            // Number of nodes in the current level
            int size = queue.size();

            // One list for this entire level
            List<Integer> res = new ArrayList<>();

            // Process exactly size nodes
            for (int i = 0; i < size; i++) {

                TreeNode temp = queue.poll();
                res.add(temp.val);

                if (temp.left != null)
                    queue.offer(temp.left);

                if (temp.right != null)
                    queue.offer(temp.right);
            }

            result.add(res);
        }

        return result;
    }
}
