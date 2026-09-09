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
    private int DFSheight(TreeNode root){
        if(root==null) return 1;
        int l = DFSheight(root.left);
        int r = DFSheight(root.right);
        //balance factor
        if(Math.abs(l-r)>1) return -1;
        if(l==-1) return -1;
        if(r==-1) return -1;
        return 1+Math.max(l,r);
    }
    public boolean isBalanced(TreeNode root) {
        
        return DFSheight(root)!=-1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna