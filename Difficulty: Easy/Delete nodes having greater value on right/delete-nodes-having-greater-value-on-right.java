/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution {
    Node compute(Node head) {
        // your code here
        Stack<Node> st = new Stack<>();
        
        while (head != null) {
            st.push(head);
            head = head.next;
        }
        
        Node newHead = st.pop();
        int max = newHead.data;
        
        while (!st.isEmpty()) {
            Node curr = st.pop();
            if (curr.data >= max) {
                curr.next = newHead;
                newHead = curr;
                max = curr.data;
            }
        }
        
        return newHead;
    }
}