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
    public int diameterOfBinaryTree(TreeNode root) {
    //     // Bruete force TC: O(n2); SC: O(n);
    //     if(root==null) return 0;
    //     int left=height(root.left);
    //     int right=height(root.right);
    //     int diameter= left+right;
    //     int sub=Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));
    //     return Math.max(diameter,sub);
    // }
    // public int height(TreeNode root){
    //     if(root==null) return 0;
    //     return 1+Math.max(height(root.left), height(root.right));
        if(root==null) return 0;
        int[] sol=new int[1];
        dfs(root, sol);
        return sol[0];
    }
    public int dfs(TreeNode root, int[] sol){
        if(root==null) return 0;
        int l=dfs(root.left, sol);
        int r=dfs(root.right,sol);
        sol[0]=Math.max(sol[0], l+r);
        return 1+Math.max(l,r);
    }
}
