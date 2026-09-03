class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        int n = start.length;
        int[][] meetings = new int[n][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> x[1] - y[1]);
        
        for (int i = 0; i < n; i++) {
            meetings[i][0] = start[i];
            meetings[i][1] = end[i];
        }
        Arrays.sort(meetings, (x, y) -> Integer.compare(x[0], y[0]));
        
        for (int i = 0; i < n; i++) {
            int startTime = meetings[i][0];
            int endTime = meetings[i][1];
            
            if (!pq.isEmpty() && pq.peek()[1] <= startTime) {
                pq.poll();
            }
            
            pq.offer(meetings[i]);
        }
        
        return pq.size();
    }
}
