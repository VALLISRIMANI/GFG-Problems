class Solution {
    public ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        // code here
        int n = intervals.length;
        ArrayList<int[]> result = new ArrayList<>();
        
        int i = 0;
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        
        int start = newInterval[0], end = newInterval[1];
        
        while (i < n && intervals[i][0] <= end) {
            start = Math.min(start, intervals[i][0]);
            end = Math.max(end, intervals[i][1]);
            i++;
        }
        
        result.add(new int[]{start, end});
        
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }
        
        return result;
    }
}
