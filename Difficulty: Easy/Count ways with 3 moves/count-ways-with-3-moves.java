class Solution {

    static int countWays(int n) {
        // add your code here
        if (n <= 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        
        int[] ways = new int[n + 1];
        ways[0] = 1;
        ways[1] = 1;
        ways[2] = 2;
        ways[3] = 4;
        
        for (int i = 4; i <= n; i++) {
            ways[i] = ways[i - 3] + ways[i - 2] + ways[i - 1];
        }
        
        return ways[n];
    }
}