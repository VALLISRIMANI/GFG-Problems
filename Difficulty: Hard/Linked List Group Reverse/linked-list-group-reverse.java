/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public Node reverseKGroup(Node head, int k) {
        // code here
        Node current = head;
        int count = 0;
        
        while (current != null && count < k) {
            current =  current.next;
            count++; 
        } 
        
        if (count < k) {
            return reverseList(head);
        }
        
        current = head;
        Node prev = null;
        Node next = null;
        count = 0;
        
        while (current != null && count < k) {
            next =  current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++; 
        } 
        
        if (next != null) {
            head.next = reverseKGroup(next, k);
        }
        
        return prev;
    }
    private Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }
}