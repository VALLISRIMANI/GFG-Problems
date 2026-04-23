/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
        
        Set<Node> seen = new HashSet<>();
        Node curr = head, prev = null;
        
        while (curr != null) {
            if (seen.contains(curr)) {
                prev.next = null;
                return;
            }
            
            seen.add(curr);
            prev = curr;
            curr = curr.next;
        }
        
        /*Node slow = head, fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                slow = head;
                
            }
                slow = head;
                slow = slow.next;
                fast = fast.next;
            }
        }*/
    }
}