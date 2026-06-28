/*
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        Node successor = null, predecessor = null, current = root;

        while (current != null) {
            if (key < current.data) {
                successor = current;
                current = current.left;
            } else if (key > current.data) {
                predecessor = current;
                current = current.right;
            } else {
                if (current.left != null) {
                    Node temp = current.left;
                    while (temp.right != null) temp = temp.right;
                    predecessor = temp;
                } 
                if (current.right != null) {
                    Node temp = current.right;
                    while (temp.left != null) temp = temp.left;
                    successor = temp;
                }
                break;
            }
        }
        
        ArrayList<Node> result = new ArrayList<>();
        result.add(predecessor);
        result.add(successor);
        return result;
    }
}