class Solution {
    public ArrayList<Integer> rotation(int n) {
        // Code Here
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(i);
        }
        
        int[] result = new int[n];
        for (int card = 1; card <= n; card++) {
            for (int j = 0; j < card; j++) {
                q.offer(q.poll());
            }
            
            int position = q.poll();
            result[position] = card;
        }
        
        ArrayList<Integer> ans = new ArrayList<>();

        for (int x : result) {
            ans.add(x);
        }

        return ans;
    }
}