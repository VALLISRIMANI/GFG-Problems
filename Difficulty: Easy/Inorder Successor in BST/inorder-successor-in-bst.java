/*
Definition for Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};
*/

class Solution {
    public int inOrderSuccessor(Node root, Node k) {
        // code here
        Node successor = null, current = root;

        while (current != null) {
            if (k.data < current.data) {
                successor = current;
                current = current.left;
            } 
            else {
                current = current.right;
            }
        }

        return (successor != null) ? successor.data : -1; 
    }
}