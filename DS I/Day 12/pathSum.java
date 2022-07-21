class Solution {
    public boolean isEqual(TreeNode root, int sum, int targetSum){
        // base case
        if(root == null){
            return false;
        }
        
        int sumTillThisNode = sum + root.val;
        
        if(root.left == null && root.right == null && sumTillThisNode == targetSum){
            return true;
        }
        
        boolean leftSubTree = isEqual(root.left, sumTillThisNode, targetSum);
        boolean rightSubTree = isEqual(root.right, sumTillThisNode, targetSum);
        
        return leftSubTree || rightSubTree;
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return isEqual(root, 0, targetSum);
    }
}