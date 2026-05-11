/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
} */

class Solution {
    int findCeil(Node root, int x) {
        // code here
        int ceil = -1;
        Node temp = root;
        
        while (temp != null) {
            if (temp.data == x) {
                ceil = temp.data;
                break;
            } else if (temp.data > x) {
                ceil = temp.data;
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        
        return ceil;
    }
}