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
    ArrayList<Integer> result = new ArrayList<Integer>();
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        if (root != null) {
            inOrder(root.left);
            result.add(root.data);
            inOrder(root.right);
        }        
        
        return result;
    }
}