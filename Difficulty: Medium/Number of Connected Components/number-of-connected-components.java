class Solution {
    int countConnected(int V, ArrayList<ArrayList<Integer>> edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (ArrayList<Integer> e : edges) {
            int u = e.get(0);
            int v = e.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean[] visited = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                count++;
                dfs(i, visited, adj);
            }
        }
        return count;
    }

    private void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        for (int neigh : adj.get(node)) {
            if (!visited[neigh]) {
                dfs(neigh, visited, adj);
            }
        }
    }
}