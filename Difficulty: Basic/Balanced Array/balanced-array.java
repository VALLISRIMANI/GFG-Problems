class Solution {
    public int minValueToBalance(List<Integer> arr) {
        // code here
        int n = arr.size();
        int mid = n / 2;

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < mid; i++) {
            leftSum += arr.get(i);
        }

        for (int i = mid; i < n; i++) {
            rightSum += arr.get(i);
        }

        return Math.abs(leftSum - rightSum);
    }
};