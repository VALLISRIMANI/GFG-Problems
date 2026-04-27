// User function Template for Java

/*
class Node {
    int data;
    Node left, right;
    Node(int key){
        this.data = key;
        this.left = this.right = null;
    }
}
*/

class Tree {
    int sum(Node root, int k) {
        // Code here
        ArrayList<Integer> inorder = new ArrayList<>();
        inOrder(root, inorder);

        int sum = 0;        
        for (int i = 0; i < k; i++) {
            sum += inorder.get(i);
        }
        
        return sum;
    }
    
    private void inOrder(Node root, ArrayList<Integer> inorder) {
        if (root != null) {
            inOrder(root.left, inorder);
            inorder.add(root.data);
            inOrder(root.right, inorder);
        }
    }
}