/* Structure of linked list Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
};*/
class Solution {
    public Node removeDuplicates(Node head) {
        // code here
        Node dummy = new Node(-1);
        dummy.next = head;
        Node prev = dummy;
        Node curr = head;
        
        while (curr != null) {
            boolean isDuplicate = false;
            
            while (curr.next != null && curr.data == curr.next.data) {
                isDuplicate = true;
                curr = curr.next;
            }
            
            if (isDuplicate) {
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            
            curr = curr.next;
        }
        
        return dummy.next;
    }
}