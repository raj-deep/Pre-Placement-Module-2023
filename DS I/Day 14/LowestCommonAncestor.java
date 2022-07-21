class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return getLCA(root, p.val, q.val);
    }

    private TreeNode getLCA(TreeNode root, int n1, int n2) {
        if (root == null)
            return null;

        if (root.val == n1 || root.val == n2)
            return root;

        if ((root.val > n1 && root.val < n2) || (root.val > n2 && root.val < n1))
            return root;

        if (root.val > n1 && root.val > n2)
            return getLCA(root.left, n1, n2);

        if (root.val < n1 && root.val < n2)
            return getLCA(root.right, n1, n2);

        return root;
    }
}
