class Solution {
    Node nextRight(Node root, int key) {
        // Write your code here
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node currentNode = queue.poll();
                if (currentNode.data == key) {
                    return (i < size - 1) ? queue.peek() : new Node(-1);
                }
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }
        return new Node(-1);
    }
}