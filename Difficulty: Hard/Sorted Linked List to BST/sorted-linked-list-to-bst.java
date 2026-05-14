// User function Template for Java

/*Linked List Node
class LNode
{
    int data;
    LNode next;
    LNode(int d) {
        data = d;
        next = null;
    }
}

//Tree Node
class TNode
{
    int data;
    TNode left, right;
    TNode(int x)
    {
        data=x;
        left=right=null;
    }

}*/

class Solution {
    LNode head; // global pointer

    // Count nodes in linked list
    int countNodes(LNode node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    // Recursive helper
    TNode sortedListToBSTUtil(int n) {
        if (n <= 0) return null;

        // Build left subtree
        TNode left = sortedListToBSTUtil(n / 2);

        // Root from current head
        TNode root = new TNode(head.data);
        root.left = left;

        // Move head forward
        head = head.next;

        // Build right subtree
        root.right = sortedListToBSTUtil(n - n / 2 - 1);

        return root;
    }
    
    public TNode sortedListToBST(LNode node) {
        // code here
        head = node;
        int n = countNodes(node);
        return sortedListToBSTUtil(n);
    }
}