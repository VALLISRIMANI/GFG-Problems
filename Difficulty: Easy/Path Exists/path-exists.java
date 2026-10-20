class Solution {
    public boolean checkPath(int V, int[][] edges, int src, int dest) {
        // Code here
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        boolean[] visited = new boolean[V];
        
        if (!visited[src]) {
            dfs(graph, V, src, visited);
        }
        
        return visited[dest];
    }
    
    private void dfs(List<List<Integer>> graph, int V, int src, boolean[] visited) {
        visited[src] = true;
        
        for (int neigh : graph.get(src)) {
            if (!visited[neigh]) {
                dfs(graph, V, neigh, visited);
            }
        }
    }
}
