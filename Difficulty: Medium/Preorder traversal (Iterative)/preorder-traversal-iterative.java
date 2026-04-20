/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> result = new  ArrayList<Integer>();
    ArrayList<Integer> preOrder(Node root) {
        // code here
        if (root != null) {
            result.add(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
        
        return result;
    }
}