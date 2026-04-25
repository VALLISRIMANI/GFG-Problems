/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        Node temp1 = head1;
        while (temp1 != null) {
            s1.push(temp1.data);
            temp1 = temp1.next;
        }
        
        Node temp2 = head2;
        while (temp2 != null) {
            s2.push(temp2.data);
            temp2 = temp2.next;
        }
        
        Node head = null;
        int carry = 0;
        
        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
            int num1 = (!s1.isEmpty()) ? s1.pop() : 0;
            int num2 = (!s2.isEmpty()) ? s2.pop() : 0;
            
            int sum = num1 + num2 + carry;
            int digit = sum % 10;
            carry = sum / 10;
            
            Node node = new Node(digit);
            node.next = head;
            head = node;
        }
        
        while (head != null && head.data == 0 && head.next != null) {
            head = head.next;
        }
        
        return head;
    }
}