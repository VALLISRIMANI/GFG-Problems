class Solution {
    public int totalCuts(ArrayList<Integer> a, int k) {
        // code here
        int n = a.size();
        
        if (n < 2) return 0;
        
        int[] suffixMin = new int[n + 1];
        suffixMin[n - 1] = a.get(n - 1);
        
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], a.get(i));
        }
        
        int count = 0, leftMax = a.get(0);
        
        for (int i = 0; i < n - 1; i++) {
            leftMax = Math.max(leftMax, a.get(i));
            int rightMin = suffixMin[i + 1];
            
            if (leftMax + rightMin >= k) {
                count++;
            }
        }
        
        return count;
    }
}