/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
*/

class Solution {
    public int maxLevelSum(Node root) {
        // code here
        if (root == null) return 0;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int maxSum = Integer.MIN_VALUE;
        
        while (!q.isEmpty()) {
            int size = q.size();
            int levelSum = 0;
            
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                levelSum += node.data;
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            
            maxSum = Math.max(maxSum, levelSum);
        }
        
        return maxSum;
    }
}