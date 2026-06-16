/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node addOne(Node head) {
        // code here.
        head = reverse(head);

        Node curr = head;
        int carry = 1; 

        while (curr != null) {
            int sum = curr.data + carry;
            curr.data = sum % 10;
            carry = sum / 10;

            if (carry == 0) break;

            if (curr.next == null && carry > 0) {
                curr.next = new Node(carry);
                carry = 0;
                break;
            }
            curr = curr.next;
        }

        head = reverse(head);
        return head;
    }
    
    private Node reverse(Node head) {
        Node prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}