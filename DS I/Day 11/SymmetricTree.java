class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true; 
            return solve(root.left,root.right);
    }
    public boolean solve(TreeNode left , TreeNode right){
        if(left == null || right == null){
            return left == right;
        }
        
        if(left.val != right.val) return false;
        
        return solve(left.left,right.right) && solve(left.right,right.left);
    }
}
