class Solution {
    public int multiply(int[] arr) {
        // code here
        int n = arr.length;
        
        if (n == 1) return 0;
        if (n == 2) return arr[0] * arr[1];
        
        int leftHalf = 0, rightHalf = 0;
        
        for (int i = 0; i < n /2; i++) {
            leftHalf += arr[i];
        }
        
        for (int i = n / 2; i < n; i++) {
            rightHalf += arr[i];
        }
        
        return leftHalf * rightHalf;
    }
}
