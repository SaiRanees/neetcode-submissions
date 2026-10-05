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
    public int kthSmallest(TreeNode root, int k) {
        // brute force 
        ArrayList<Integer> a=new ArrayList<>();
        dfs(root,a);
        Collections.sort(a);
        return a.get(k-1);
    }
    public void dfs(TreeNode r, List<Integer> a){
        if(r==null) return;
        a.add(r.val);
        dfs(r.left,a);
        dfs(r.right,a);
    }
}
