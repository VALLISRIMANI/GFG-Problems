class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int partialSum = 0;
        int totalSum = 0;

        for(int num : arr) {
            totalSum += num;
        }

        for(int i = arr.length - 1; i >= 0; i--) {
            partialSum += arr[i];
            totalSum -= arr[i];

            if(partialSum == totalSum) {
                return true;
            } 
        }

        return false; 
    }
}