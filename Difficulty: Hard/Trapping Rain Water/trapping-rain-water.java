class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        if (n <= 2) return 0;
        
        int totalWater = 0;
        int left = 0, right = n - 1;
        int leftMax = arr[left], rightMax = arr[right];

        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, arr[left]);
                totalWater += Math.max(0, leftMax - arr[left]);
            } else {
                right--;
                rightMax = Math.max(rightMax, arr[right]);
                totalWater += Math.max(0, rightMax - arr[right]);
            }
        }

        return totalWater;
    }
}
