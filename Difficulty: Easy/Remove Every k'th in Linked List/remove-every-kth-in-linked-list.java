/* structure for link list node
class Node {
    Node next;
    int data;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node deleteK(Node head, int k) {
        // Your code here
        if (head == null || k == 1) return null; 
        
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy, curr = head;
        int count = 1;

        while (curr != null) {
            if (count % k == 0) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
            count++;
        }

        return dummy.next;
    }
}
