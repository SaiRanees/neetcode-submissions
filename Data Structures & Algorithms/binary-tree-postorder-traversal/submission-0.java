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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        dfs(root,a);
        return a;
    }
    public void dfs(TreeNode r, List<Integer> a){
        if(r==null) return;
        dfs(r.left,a);
        dfs(r.right,a);
        a.add(r.val);
        
        
        
    }
}