class Solution {
    public int coin(int[] arr) {
        // code here
        int n = arr.length;
        int i = 0, j = n - 1;
        
        int lastPicked = -1;
        
        while (i <= j) {
            if (arr[i] >= arr[j]) {
                lastPicked = arr[i++];
            } else {
                lastPicked = arr[j--];
            }
        }
        
        return lastPicked;
    }
}