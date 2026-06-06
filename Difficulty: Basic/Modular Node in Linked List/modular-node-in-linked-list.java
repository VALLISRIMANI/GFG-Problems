/*node class of the linked list is as:
class Node {
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
    public int modularNode(Node head, int k) {
        // code here
        Node temp = head;
        int pos = 0;
        int result = -1;
        
        while (temp != null) {
            pos++;
            
            if (pos % k == 0) {
                result = temp.data;
            }
            
            temp = temp.next;
        }
        
        
        return result;
    }
}