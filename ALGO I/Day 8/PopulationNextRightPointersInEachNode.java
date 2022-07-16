class Solution {
public Node connect(Node root) {

    if(root == null)
        return root;
    
    root.left = connect(root.left);
    root.right = connect(root.right);
    
    if(root.left != null && root.right != null)
    {
        root.left.next = root.right;
        
        Node rightMostInLeft = root.left;
        Node leftMostInRight = root.right;
        
        while(rightMostInLeft.right != null)
        {
            rightMostInLeft = rightMostInLeft.right;        
        
            leftMostInRight = leftMostInRight.left;
            
            rightMostInLeft.next = leftMostInRight;
        }    
    } 
    
    
    return root;
    
}
}