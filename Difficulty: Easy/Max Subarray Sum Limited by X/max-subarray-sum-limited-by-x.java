class Solution {
    public int maxSum(int[] arr, int x) {
        // code here
        int left = 0;
        int sum = 0;
        int maxSum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > x && left <= right) {
                sum -= arr[left];
                left++;
            }
    
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
};