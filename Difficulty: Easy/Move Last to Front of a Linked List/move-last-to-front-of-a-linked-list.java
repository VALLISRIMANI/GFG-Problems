/*
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/

class Solution {
    public static Node moveToFront(Node head) {
        // code here
        if (head == null || head.next == null) return head;
        
        Node temp = head;
        
        while (temp.next.next != null) {
            temp = temp.next;
        }
        
        Node newHead = temp.next;
        temp.next = null;
        newHead.next = head;
        head = newHead;
        
        return head;
    }
}
