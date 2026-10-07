/* class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n = deadline.length;
        int[][] jobs = new int[n][2];
        
        int maxDeadline = -1;
        
        for (int i = 0; i < n; i++) {
            jobs[i][0] = profit[i];
            jobs[i][1] = deadline[i];
            maxDeadline = Math.max(maxDeadline, deadline[i]);
        }
        
        Arrays.sort(jobs, (a, b) -> b[0] - a[0]);
        
        int jobsSelected = 0;
        int totalProfit = 0;
        boolean[] slot = new boolean[maxDeadline + 1];
        
        for (int[] job : jobs) {
            for (int i = job[1]; i >= 1; i--) {
                
                if (!slot[i]) {
                    slot[i] = true;
                    
                    jobsSelected++;
                    totalProfit += job[0];
                    
                    break;
                }
            }
        }
        
        return new ArrayList<>(Arrays.asList(jobsSelected, totalProfit));
    }
}
*/

class Solution {

    int[] parent;

    int find(int x) {
        if (parent[x] == x)
            return x;

        return parent[x] = find(parent[x]);
    }

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {

        int n = deadline.length;

        int[][] jobs = new int[n][2];
        int maxDeadline = 0;

        for (int i = 0; i < n; i++) {
            jobs[i][0] = profit[i];
            jobs[i][1] = deadline[i];
            maxDeadline = Math.max(maxDeadline, deadline[i]);
        }

        Arrays.sort(jobs, (a, b) -> b[0] - a[0]);

        parent = new int[maxDeadline + 1];

        for (int i = 0; i <= maxDeadline; i++) {
            parent[i] = i;
        }

        int jobsDone = 0;
        int totalProfit = 0;

        for (int[] job : jobs) {

            int availableSlot = find(job[1]);

            if (availableSlot > 0) {

                jobsDone++;
                totalProfit += job[0];

                parent[availableSlot] = find(availableSlot - 1);
            }
        }

        return new ArrayList<>(Arrays.asList(jobsDone, totalProfit));
    }
}