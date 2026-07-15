class Solution {
    public boolean isBipartite(int V, int[][] edges) {
        // Code here
        ArrayList<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
        
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            adj[u].add(v);
            adj[v].add(u);
        }
        
        int[] color = new int[V];
        Arrays.fill(color, -1);
        
        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                if (dfs(i, 0, color, adj) == false) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    boolean dfs(int node, int c, int[] color, ArrayList<Integer>[] adj) {
        color[node] = c;
        
        for (int neigh : adj[node]) {
            if (color[neigh] == -1) {
                if (dfs(neigh, 1 - c, color, adj) == false) {
                    return false;
                }
            } else if (color[neigh] == c) {
                return false;
            }
        }
        
        return true;
    }
}