class Solution {
    public int minRemoval(int intervals[][]) {
        // code here
        Arrays.sort(intervals, (a, b) -> (a[1] - b[1]));
        
        int count = 0;
        int previousEnd = intervals[0][1];
        
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < previousEnd) {
                count++;
            } else {
                previousEnd = intervals[i][1];
            }
        }
        
        return count++;
    }
}