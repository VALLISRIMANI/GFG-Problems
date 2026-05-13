/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        Node temp = head;
        
        while (temp != null) {
            result.add(temp.data);
            temp = temp.next;
        }
        
        return result;
    }
}