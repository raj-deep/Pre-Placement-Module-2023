class Solution {
    List<Integer> ls = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null){
            return ls;
        }
        
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        ls.add(root.val);
        
        return ls;
    }
}