/*
// Representation of a node
class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};
*/
class Solution {
    public Node arrayToList(int arr[]) {
        // code here
        Node dummy = new Node(0);
        Node temp = dummy;
        
        for (int i = 0; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        
        return dummy.next;
    }
}
