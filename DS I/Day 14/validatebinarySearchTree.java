
class Solution {
    private short currentDepth = 0;
    private long max = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root == null) {
            return true;
        }
        ++currentDepth;
        var leftCheck = isValidBST(root.left);
        --currentDepth;
        if(max < root.val) {
            max = root.val;
        } else {
            return false;
        }
        ++currentDepth;
        var rightCheck = isValidBST(root.right);
        --currentDepth;
        if(currentDepth == 0) {
            max = Long.MIN_VALUE;
        }
        return leftCheck && rightCheck;
    }
}