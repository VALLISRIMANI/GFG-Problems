class Solution {
    public void rearrange(int arr[]) {
        // code here
        int n = arr.length;
        if (n == 1) return;
        
        Arrays.sort(arr);
        int[] firstHalf;
        int[] secondHalf;
        
        if (n % 2 == 0) {
            firstHalf = new int[n / 2];
            secondHalf = new int[n / 2];
            
            for (int i = 0; i < n / 2; i++) {
                firstHalf[i] = arr[i]; 
                secondHalf[i] = arr[n - 1 - i];
            }
        } else {
            firstHalf = new int[n / 2 + 1];
            secondHalf = new int[n / 2];
            
            for (int i = 0; i < n / 2; i++) {
                firstHalf[i] = arr[i]; 
                secondHalf[i] = arr[n - 1 - i];
            }
            
            firstHalf[n / 2] = arr[n / 2];
        }
        
        int idx = 0;
        
        for (int i = 0; i < secondHalf.length; i++) {
            arr[idx++] = secondHalf[i];
            arr[idx++] = firstHalf[i];
        }
        
        if (n % 2 != 0) {
            arr[n - 1] = firstHalf[firstHalf.length - 1];
        }
    }
}