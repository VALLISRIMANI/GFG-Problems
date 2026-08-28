class Solution {
    public void sortHalves(int[] arr) {
        // code here
        int n = arr.length;
        int mid = n / 2;
        int i = 0, j = mid, idx = 0;;
        int[] result = new int[n];
        
        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr, mid, n);
        
        while (i < mid && j < n) {
            if (arr[i] <= arr[j]) {
                result[idx++] = arr[i++];
            } else {
                result[idx++] = arr[j++];
            }
        }
        
        while (i < mid) {
            result[idx++] = arr[i++];
        }
        while (j < n) {
            result[idx++] = arr[j++];
        }
        
        for (int k = 0; k < n; k++) {
            arr[k] = result[k];
        }
    }
}