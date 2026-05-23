// User function Template for Java

class Solution {
    int countZeroes(int[] arr) {
        // code here
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                return n - i;
            }
        }
        
        return 0;
    }
}
