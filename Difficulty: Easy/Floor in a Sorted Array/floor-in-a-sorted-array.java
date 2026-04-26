class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int low = 0, high = arr.length - 1;
        int resultIdx = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] <= x) {
                resultIdx = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return resultIdx;
    }
}
