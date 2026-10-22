class Solution {

    private int timer = 0;

    public ArrayList<ArrayList<Integer>> criticalConnections(
        int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here

        int[] disc = new int[V];
        int[] low = new int[V];

        ArrayList<ArrayList<Integer>> bridges = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            if (disc[i] == 0) {
                dfs(i, -1, adj, disc, low, bridges);
            }
        }
        
        Collections.sort(bridges, (a, b) -> {
            if (!a.get(0).equals(b.get(0))) {
                return a.get(0) - b.get(0);
            }
            return a.get(1) - b.get(1);
        });

        return bridges;
    }

    private void dfs(
        int u,
        int parent,
        ArrayList<ArrayList<Integer>> adj,
        int[] disc,
        int[] low,
        ArrayList<ArrayList<Integer>> bridges) {

        disc[u] = low[u] = ++timer;

        for (int v : adj.get(u)) {

            if (v == parent) {
                continue;
            }

            if (disc[v] == 0) {

                dfs(v, u, adj, disc, low, bridges);

                low[u] = Math.min(low[u], low[v]);

                if (low[v] > disc[u]) {
                    ArrayList<Integer> bridge = new ArrayList<>();

                    bridge.add(Math.min(u, v));
                    bridge.add(Math.max(u, v));

                    bridges.add(bridge);
                }

            } else {

                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
}