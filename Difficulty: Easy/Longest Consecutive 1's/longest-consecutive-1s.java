class Solution {
    public static int maxConsecutiveOnes(int n) {
        // code here
        int max = 0, ones = 0;
        
        while (n > 0) {
            if ((n & 1) == 1) {
                ones++;
                max = Math.max(max, ones);
            } else {
                ones = 0;
            }
            
            n >>>= 1;
        }
        
        return max;
    }
}
