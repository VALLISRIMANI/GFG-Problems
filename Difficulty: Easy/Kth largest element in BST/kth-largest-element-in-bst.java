/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root, int k) {
        // Your code here
        ArrayList<Integer> inorder = new ArrayList<>();
        inOrder(root, inorder);
        
        return inorder.get(inorder.size() - k);
    }
    
    private void inOrder(Node root, ArrayList<Integer> inorder) {
        if (root != null) {
            inOrder(root.left, inorder);
            inorder.add(root.data);
            inOrder(root.right, inorder);
        }
    }
}