class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        int n = arr.length;
        int count = 0;
        
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            
            while (left < right) {
                int sumValue = arr[i] + arr[left] + arr[right];
                
                if (sumValue < sum) {
                    count += right - left;
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return count;
    }
}