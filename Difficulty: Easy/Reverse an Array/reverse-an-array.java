class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        int left = 0, right = n - 1;
        
        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}