class Solution {
    int minSubset(int[] arr) {
        // code here
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        Arrays.sort(arr);

        int result = 0;
        int currSum = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            currSum += arr[i];
            result++;

            if (currSum > (totalSum - currSum)) break;
        }

        return result;
    }
}