class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
		if(root==null)
        {
            TreeNode temp = new TreeNode(val);
            root=temp;
            return root;
        }
        
        if(root.val<val && root.right!=null)
        {
            insertIntoBST(root.right, val);
            return root;
        }
        else if(root.val>val && root.left!=null)
        {
            insertIntoBST(root.left, val);
            return root;
        }
        
		
        if(root.val<val && root.right==null)
        {
            TreeNode temp = new TreeNode(val);
            root.right=temp;
            return root;
        }
        else if (root.val>val && root.left==null)
        {
            TreeNode temp = new TreeNode(val);
            root.left=temp;
            return root;
        }
        return root;
    }
}