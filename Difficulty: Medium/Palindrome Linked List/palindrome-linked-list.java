/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        Stack<Node> st = new Stack<>();
        
        Node temp1 = head;
        while (temp1 != null) {
            st.push(temp1);
            temp1 = temp1.next;
        }
        
        Node temp2 = head;
        while (!st.isEmpty()) {
            if (st.pop().data != temp2.data) return false;
            temp2 = temp2.next;
        }
        
        return true;
    }
}