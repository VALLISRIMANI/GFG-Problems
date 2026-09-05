/* Structure of linked list Node
class Node {
  public:
    int data;
    Node* next;

    Node(int x) {
        data = x;
        next = null;
    }
};
*/
class Solution {
    public Node partition(Node head, int x) {
        // code here
        if (head == null) return head;

        Node lessHead = new Node(-1);
        Node equalHead = new Node(-1);
        Node greaterHead = new Node(-1);
        Node less = lessHead, equal = equalHead, greater = greaterHead;
        Node temp = head;

        while (temp != null) {
            if (temp.data == x) {
                equal.next = temp;
                equal = equal.next;
            } else if (temp.data < x) {
                less.next = temp;
                less = less.next;
            } else {
                greater.next = temp;
                greater = greater.next;
            }

            temp = temp.next;
        }
        
        greater.next = null;

        less.next = (equalHead.next != null) ? equalHead.next : greaterHead.next;
        if (equalHead.next != null) equal.next = greaterHead.next;
        return lessHead.next;
    }
};