/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    public static int getLength(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        
        int length = 0;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            length++;
            
            if (slow == fast) break;
        }
        
        return length;
    }
}