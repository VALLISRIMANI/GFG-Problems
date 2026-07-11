class Solution {
    public int minJumps(int[] arr) {
        // code here
        if (arr[0] == 0) return -1;
        int maxReach = arr[0], currentEnd = arr[0], minJumps = 1;
        
        for (int i = 1; i < arr.length; i++) {
            if (i > maxReach) return -1;
            
            maxReach = Math.max(maxReach, i + arr[i]);
            
            if (i == arr.length - 1) return minJumps;
            
            if (i == currentEnd) {
                minJumps++;
                currentEnd = maxReach;
            }
        }
        
        return -1;
    }
}