/* node class of the linked list

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
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head) {
        // code here
        if (head == null || head.next == null) return head;

        Node newHead = head.next;

        Node prev = null;
        Node curr = head;

        while (curr != null && curr.next != null) {
            Node nextPair = curr.next.next;
            Node second = curr.next;         
            
            second.next = curr;
            curr.next = nextPair;

            if (prev != null) {
                prev.next = second;
            }
            
            prev = curr;
            curr = nextPair;
        }

        return newHead;
    }
}
