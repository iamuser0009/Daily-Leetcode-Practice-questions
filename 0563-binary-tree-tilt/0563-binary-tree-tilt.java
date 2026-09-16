/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum=0;
   
    public int findTilt(TreeNode root) {
         tilt(root);
         return sum;
    }

     int tilt(TreeNode root){
        if(root==null) return 0;
        int lefts=tilt(root.left);
        int rights=tilt(root.right);
        sum+=Math.abs(lefts-rights);
        return lefts + rights + root.val;
    }
}