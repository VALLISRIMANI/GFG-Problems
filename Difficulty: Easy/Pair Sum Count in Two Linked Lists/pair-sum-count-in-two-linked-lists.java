/*Structure of a link list node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}*/

class Solution {
    public int countPairs(Node head1, Node head2, int x) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        Node temp1 = head1, temp2 = head2;
        int countPairs = 0;
        
        while (temp1 != null) {
            set.add(temp1.data);
            temp1 = temp1.next;
        }
        
        while (temp2 != null) {
            int target = x - temp2.data;
            if (set.contains(target)) {
                countPairs++;
            }
            
            temp2 = temp2.next;
        }
        
        return countPairs;
    }
}