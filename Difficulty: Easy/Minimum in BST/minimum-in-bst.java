/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    public int minValue(Node root) {
        // code here
        if (root == null) return -1;
        return (root.left == null) ? root.data : minValue(root.left);
    }
}