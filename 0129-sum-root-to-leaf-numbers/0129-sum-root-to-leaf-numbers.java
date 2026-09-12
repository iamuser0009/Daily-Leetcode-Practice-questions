class Solution {

    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    public int helper(TreeNode root, int num) {

        if (root == null) {
            return 0;
        }

        num = num * 10 + root.val;

        // Leaf node
        if (root.left == null && root.right == null) {
            return num;
        }

        int leftsum = helper(root.left, num);
        int rightsum = helper(root.right, num);

        return leftsum + rightsum;
    }
}