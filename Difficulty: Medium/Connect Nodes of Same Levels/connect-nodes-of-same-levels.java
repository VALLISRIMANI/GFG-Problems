/*  Structure of Binary Tree Node
class Node{
    int data;
    Node left;
    Node right;
    Node nextRight;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
        nextRight = null;
    }
} */

class Solution {
    public Node connect(Node root) {
        // code here.
        Node curr = root;

        while (curr != null) {
            Node dummy = new Node(0);
            Node tail = dummy;

            while (curr != null) {
                if (curr.left != null) {
                    tail.nextRight = curr.left;
                    tail = tail.nextRight;
                }
                if (curr.right != null) {
                    tail.nextRight = curr.right;
                    tail = tail.nextRight;
                }
                curr = curr.nextRight;
            }

            curr = dummy.nextRight;
        }

        return root;
    }
}