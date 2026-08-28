class Solution {
    public int firstIndex(int arr[]) {
        // code here
        return search(arr, 0, arr.length - 1);
    }
    
    public int search(int[] arr, int left, int right) {
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == 1) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            } 
        }
        
        return result;
    }
}