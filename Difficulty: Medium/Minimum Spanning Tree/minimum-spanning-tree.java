class Solution {
    public int spanningTree(int V, int[][] edges) {
        // code here
        DSU dsu = new DSU(V);
        
        Arrays.sort(edges, (a, b) -> Integer.compare(a[2], b[2]));
        
        int mstWeight = 0;
        List<int[]> mstEdges = new ArrayList<>();

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];

            if (dsu.find(u) != dsu.find(v)) {
                dsu.union(u, v);
                mstWeight += weight;
                mstEdges.add(edge);
            }
        }
        
        return mstWeight;   
    }
}

class DSU {
    int n;
    int[] parent;
    int[] rank;

    DSU(int n) {
        this.n = n;
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    int find(int i) {
        if (parent[i] != i) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    void union(int i, int j) {
        int rootI = find(i);
        int rootJ = find(j);

        if (rootI != rootJ) {
            if (rank[rootI] < rank[rootJ]) {
                parent[rootI] = rootJ;
            } else if (rank[rootI] > rank[rootJ]) {
                parent[rootJ] = rootI;
            } else {
                parent[rootJ] = rootI;
                rank[rootI]++;
            }
        }
    }
}