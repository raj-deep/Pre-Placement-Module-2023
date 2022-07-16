
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        
        return traversal(root1, root2);
        
    }
    
    TreeNode traversal(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null)
            return null;
        if(node1 == null && node2!=null)
            return node2;
        if(node1!=null && node2 == null)
            return node1;
        
        TreeNode root = new TreeNode(node1.val+node2.val);
        root.left = traversal(node1.left, node2.left);
        root.right = traversal(node1.right, node2.right);
        
        return root;
            
        
    }
}