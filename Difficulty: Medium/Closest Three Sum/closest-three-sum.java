class Solution {
    public int closest3Sum(int[] arr, int target) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int closest = arr[0] + arr[1] + arr[2]; 

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                int currentDiff = Math.abs(sum - target);
                int closestDiff = Math.abs(closest - target);

                if (currentDiff < closestDiff || (currentDiff == closestDiff && sum > closest)) {
                    closest = sum;
                }

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return sum;
                }
            }
        }
        
        return closest;
    }
}