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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> s= new ArrayList<>();
        if(root==null) return new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> level=new ArrayList<>();
            while(n-->0){
                TreeNode start=q.peek();
                level.add(start.val);
                q.poll();
                if(start.left!=null) q.offer(start.left);
                if(start.right!=null) q.offer(start.right);
            }
            s.add(level);
        }
        return s;
    }
}
