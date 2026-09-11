class Solution {
    public int maxIncSubarraySum(int arr[]) {
        // code here
        int sum = arr[0];
        int maxSum = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                maxSum = Math.max(maxSum, sum);
                sum = 0;
            }

            sum += arr[i];
        }

        maxSum = Math.max(maxSum, sum);

        return maxSum;
    }
}