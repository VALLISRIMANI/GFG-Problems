/* Structure of a Tree Node
class Node {
  public:
    int data;
    Node left;
    Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};
*/

class Solution {
    HashSet<String> set = new HashSet<>();
    boolean found = false;
    
    public boolean dupSub(Node root) {
        // code here
        serialize(root);

        return found;
    }

    private String serialize(Node node) {
        if (node == null) return "#";

        String left = serialize(node.left);
        String right = serialize(node.right);
        String subTree = node.data + "," + left + "," + right;

        if (node.left != null || node.right != null) {
            if (set.contains(subTree)) {
                found = true;
            }

            set.add(subTree);
        }

        return subTree;
    }
}
