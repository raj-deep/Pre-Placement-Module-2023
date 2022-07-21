class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) {
            return null;
        }
        while(root!=null) {
            if(root.val==val)
                return root;
            if(root.val<val)
                root = root.right;
            else
                root = root.left;
        }
        return root;
    }
}