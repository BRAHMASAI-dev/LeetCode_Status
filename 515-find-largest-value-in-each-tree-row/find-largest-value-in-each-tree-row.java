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
    public List<Integer> largestValues(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    Deque<TreeNode> q = new ArrayDeque<>();
    if(root == null) return res;
    q.offer(root);
    int m = Integer.MIN_VALUE;
    while(!q.isEmpty()){
        int sz = q.size();
        for(int i=0; i<sz; i++){
            TreeNode temp = q.pop();
            if(temp.val >= m)
                m = temp.val;
            if(temp.left!=null) q.offer(temp.left);
            if(temp.right!=null) q.offer(temp.right);
        }
        res.add(m);
        m = Integer.MIN_VALUE;
    }
    return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna