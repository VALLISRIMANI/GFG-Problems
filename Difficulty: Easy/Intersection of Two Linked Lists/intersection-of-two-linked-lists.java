/* structure of list node:

class Node
{
    int data;
    Node next;
    Node(int val)
    {
        data=val;
        next=null;
    }
}

*/

class Solution {
    public Node findIntersection(Node head1, Node head2) {
        // code here
        Set<Integer> set = new HashSet<>();
        Node temp = head2;
        
        while (temp != null) {
            set.add(temp.data);
            temp = temp.next;
        }
        
        Node dummy = head1;
        Node result = new Node(-1);
        Node tail = result;
        
        while (dummy != null) {
            if (set.contains(dummy.data)) {
                tail.next = new Node(dummy.data); 
                tail = tail.next;
            }
            
            dummy = dummy.next;
        }
        
        return result.next; 
    }
}