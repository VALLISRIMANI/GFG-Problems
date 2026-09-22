/* Structure of linked list Node
class Node {
    public int data;
    public Node next;

    public Node(int x) {
        data = x;
        next = null;
    }
};*/

class Solution {
    public boolean isSorted(Node head) {
        // code here
        boolean increasing = true;
        boolean decreasing = true;
        
        Node curr = head;
        
        while (curr.next != null) {
            if (curr.data > curr.next.data) {
                increasing = false;
            }
            
            if (curr.data < curr.next.data) {
                decreasing = false;
            }
            
            curr = curr.next;
        }
        
        return increasing || decreasing;
    }
}