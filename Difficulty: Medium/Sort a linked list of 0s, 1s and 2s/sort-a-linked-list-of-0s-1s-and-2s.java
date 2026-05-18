/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        if (head == null || head.next == null) return head;

        Node zeroDummy = new Node(-1), oneDummy = new Node(-1), twoDummy = new Node(-1);
        Node zero = zeroDummy, one = oneDummy, two = twoDummy;

        Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }

        zero.next = (oneDummy.next != null) ? oneDummy.next : twoDummy.next;
        one.next = twoDummy.next;
        two.next = null; 
        
        return zeroDummy.next != null ? zeroDummy.next 
             : (oneDummy.next != null ? oneDummy.next : twoDummy.next);
    }
}
