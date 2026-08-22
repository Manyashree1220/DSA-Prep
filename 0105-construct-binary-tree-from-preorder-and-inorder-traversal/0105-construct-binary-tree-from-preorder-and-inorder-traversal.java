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
    int preindex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return construct(preorder,inorder,0,preorder.length-1);
    }
    TreeNode construct(int[] preorder,int[] inorder,int left,int right)
    {
        if(left>right)
            return null;
        int rootv=preorder[preindex++];
        TreeNode root=new TreeNode(rootv);
        int index=left;
        while(inorder[index]!=rootv)
            index++;
        root.left=construct(preorder,inorder,left,index-1);
        root.right=construct(preorder,inorder,index+1,right);
        return root;
    }
}