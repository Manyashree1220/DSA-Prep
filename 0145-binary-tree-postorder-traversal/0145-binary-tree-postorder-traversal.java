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
    List<Integer> res=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();
        if(root==null)
            return res;
        st1.push(root);
        while(!st1.isEmpty())
        {
            TreeNode node=st1.pop();
            st2.push(node);
            if(node.left!=null)
                st1.push(node.left);
            if(node.right!=null)
                st1.push(node.right);
        }
        while(!st2.isEmpty())
        {
            res.add(st2.pop().val);
        }
        return res;
    }
    // void postorder(TreeNode root)
    // {
    //     if(root!=null){
    //     postorderTraversal(root.left);
    //     postorderTraversal(root.right);
    //     res.add(root.val);
    //     }
    // }
}