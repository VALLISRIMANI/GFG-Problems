/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if (x == 1) return head.next;
        
        Node temp = head;
        int count = 2;
        
        while (temp != null) {
            if (count == x) {
                temp.next = temp.next.next;
                break;
            } 
            
            count++;
            temp = temp.next;
        }
        
        return head;
    }
}