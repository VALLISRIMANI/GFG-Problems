/* Structure of a Linked list Node
 class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node findIntersection(Node head1, Node head2) {
        // code here
        Node temp1 = head1, temp2 = head2;
        
        Node result = new Node(-1);
        Node temp = result;
        
        while (temp1 != null && temp2 != null) {
            if (temp1.data == temp2.data) {
                temp.next = new Node(temp1.data);
                temp = temp.next;
                
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else if (temp1.data < temp2.data) {
                temp1 = temp1.next;
            } else {
                temp2 = temp2.next;
            }
        }
        
        return result.next;
    }
}