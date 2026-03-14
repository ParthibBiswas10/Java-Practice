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
    public boolean isBalanced(TreeNode root) {
        int lh=0;
        int rh=0;
        int h=0;
        if (root == null) return true;
        
    
        lh=height(root.left);
        if(root.left!=null) lh++;
        rh=height(root.right);
            if(root.right!=null) rh++;
        int diff=lh-rh;
        if(diff<0) diff=-diff;
        if(diff>1) return false;
        else
            return (isBalanced(root.left)&&isBalanced(root.right));
    }
    public int height(TreeNode root){
       if(root==null||(root.left==null && root.right==null)) return 0;
       return 1+Math.max(height(root.left),height(root.right));
    }
}