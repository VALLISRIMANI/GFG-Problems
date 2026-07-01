class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        // code here
        int[] inDegree = new int[n];
        Queue<Integer> q = new LinkedList<>();
        
        for (int[] prerequisite : prerequisites) {
            inDegree[prerequisite[0]]++;
        }
        
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                q.offer(i);
            }
        }
        
        int count = 0;
        
        while (!q.isEmpty()) {
            int current = q.poll();
            count++;
            
            for (int[] prequisite : prerequisites) {
                if (prequisite[1] == current) {
                    inDegree[prequisite[0]]--;
                    if (inDegree[prequisite[0]] == 0) {
                        q.offer(prequisite[0]);
                    }
                }
            }
        }
        
        return count == n;
    }
}