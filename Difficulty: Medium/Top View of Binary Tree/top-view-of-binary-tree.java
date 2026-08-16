/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    static class Pair {
        Node node;
        int hd;
        Pair(Node n, int h) {
            node = n;
            hd = h;
        }
    }
    
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;
    
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
    
        queue.add(new Pair(root, 0));
    
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            Node curr = p.node;
            int hd = p.hd;
    
            if (!map.containsKey(hd)) {
                map.put(hd, curr.data);
            }
    
            if (curr.left != null) queue.add(new Pair(curr.left, hd - 1));
            if (curr.right != null) queue.add(new Pair(curr.right, hd + 1));
        }
    
        result.addAll(map.values());
        return result;
    }
}