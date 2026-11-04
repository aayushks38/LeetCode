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
        List<Integer> ans = new ArrayList<>();
        postordertraverse(root, ans);
        return ans;
    }
    void postordertraverse(TreeNode root, List<Integer> ans){
        if(root == null){
            return;
        }
        postordertraverse(root.left, ans);
        postordertraverse(root.right, ans);
        ans.add(root.val);
    }
}