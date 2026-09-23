class Solution {
    public int minStep(int h, int u, int d) {
        // code here
        if (u >= h) return 1;
        
        return (h - u + (u - d) - 1) / (u - d) + 1;
    }
}