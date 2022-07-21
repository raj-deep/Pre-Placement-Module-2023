class Solution {
    List<Integer> ls = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return ls;
        }
        ls.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        
        return ls;
    }
}