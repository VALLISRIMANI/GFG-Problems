/* Node Structure
class Node {
    String data;
    Node next;
    Node(String x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public boolean compute(Node root) {
        // code here
        StringBuilder sb = new StringBuilder();
        
        Node temp = root;
        while (temp != null) {
            sb.append(temp.data);
            temp = temp.next;
        }
        
        int left = 0, right = sb.length() - 1;
        
        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}