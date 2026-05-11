/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBST(Node root) {
        // code here
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean helper(Node node, long min, long max) {
        if (node == null) return true;
        
        if (node.data <= min || node.data >= max) return false;
        
        return helper(node.left, min, node.data) && helper(node.right, node.data, max);
    }
}