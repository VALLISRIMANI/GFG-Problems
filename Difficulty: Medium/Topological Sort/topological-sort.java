class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        int[] inDegree = new int[V];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int[] edge : edges) {
            inDegree[edge[1]]++;
        }
        
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                q.offer(i);
            }
        }
        
        while (!q.isEmpty()) {
            int current = q.poll();
            result.add(current);
            
            for (int[] edge : edges) {
                if (edge[0] == current) {
                    inDegree[edge[1]]--;
                    if (inDegree[edge[1]] == 0) {
                        q.offer(edge[1]);
                    }
                }
            }
        }
        
        return result;
    }
}