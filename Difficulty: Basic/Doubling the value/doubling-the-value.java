class Solution {
    public int solve(int b, List<Integer> arr) {
        // code here
        for (int num : arr) {
            if (num == b) {
                b *= 2;
            }
        }
        
        return b;
    }
}