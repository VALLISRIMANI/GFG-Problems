class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // code here
        int i = 0, j = 0;
        int sum = 0, minLen = Integer.MAX_VALUE;
        
        while (j < arr.length) {
            sum += arr[j];
            
            while (sum > x) {
                minLen = Math.min(minLen, j - i + 1);
                sum -= arr[i];
                i++;
            }
            
            j++;
        }
        
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}