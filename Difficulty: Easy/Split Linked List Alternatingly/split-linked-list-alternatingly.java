/* Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {

    public ArrayList<Node> alternatingSplitList(Node head) {
        // code here
        Node dummy1 = new Node(-1);
        Node dummy2 = new Node(-1);

        Node tail1 = dummy1;
        Node tail2 = dummy2;

        boolean first = true;

        while (head != null) {

            if (first) {
                tail1.next = new Node(head.data);
                tail1 = tail1.next;
            } else {
                tail2.next = new Node(head.data);
                tail2 = tail2.next;
            }

            first = !first;
            head = head.next;
        }

        return new ArrayList<>(Arrays.asList(dummy1.next, dummy2.next));
    }
}