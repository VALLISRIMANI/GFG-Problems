/* Structure of doubly linked list Node
class Node {
  public int data;
  public Node next;
  public Node prev;

  public Node(int x) {
      data = x;
      next = null;
      prev = null;
  }
};*/
class Solution {
    public List<List<Integer>> displayList(Node head) {
        // code here
        List<List<Integer>> result = new ArrayList<>();
        
        List<Integer> forward = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            forward.add(temp.data);
            temp = temp.next;
        }
        
        Node last = head;
        while (last != null && last.next != null) {
            last = last.next;
        }
        
        List<Integer> backward = new ArrayList<>();
        while (last != null) {
            backward.add(last.data);
            last = last.prev;
        }
        
        result.add(forward);
        result.add(backward);
        
        return result;
    }
}