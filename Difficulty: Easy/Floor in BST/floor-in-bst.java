/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int findMaxFork(Node root, int k) {
        // code here.
        int greatest = -1;
        Node temp = root;
        
        while (temp != null) {
            if (temp.data == k) {
                greatest = temp.data;
                break;
            } else if (temp.data > k) {
                temp = temp.left;
            } else {
                greatest = temp.data;
                temp = temp.right;
            }
        }
        
        return greatest;
    }
}