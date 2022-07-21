class Solution {
    List<Integer> ls = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return ls;
        }
        inorderTraversal(root.left);
        ls.add(root.val);
        inorderTraversal(root.right);
        
        return ls;
    }
}