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
    List<Integer> list=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        for(int i=0;i<list.size();i++)
        {
            if(k==(i+1))
                return list.get(i);
        }
        return 0;
    }
    void inorder(TreeNode root)
    {
        if(root==null)
            return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}