class Solution {
    public long get_Sum(int n, int[] input) {
        // code here
        long sum = 0;
        
        for (int num : input) {
            sum += num;
        }
        
        return sum;
    }
}