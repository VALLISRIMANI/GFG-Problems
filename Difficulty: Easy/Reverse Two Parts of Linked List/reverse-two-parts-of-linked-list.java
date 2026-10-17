/* Structure of linked list Node
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public static Node reverse(Node head, int k) {
        // code here
        Node curr = head;

        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }

        Node secondHead = curr.next;
        curr.next = null; 

        Node firstRev = reverseParts(head);
        Node secondRev = reverseParts(secondHead);

        Node temp = firstRev;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = secondRev;

        return firstRev;  
        
    }
    
    static Node reverseParts(Node head) {
        Node prev = null;
        Node curr = head;
        
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}
