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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preordertraversal(root, ans);
        return ans;

    }
    void preordertraversal(TreeNode root, List<Integer> ans){
        if(root == null)
            return;
        
        ans.add(root.val);
        preordertraversal(root.left, ans);
        preordertraversal(root.right, ans);
    }
}