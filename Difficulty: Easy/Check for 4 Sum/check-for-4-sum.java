class Solution {
    public boolean fourSum(int[] arr, int x) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;
                
                int left = j + 1, right = n - 1;
                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                
                    if (sum < x) {
                        left++;
                    } else if (sum > x) {
                        right--;
                    } else {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
}