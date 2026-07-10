class Solution {
    // Function to check if we can reach the last index from the 0th index.
    public boolean canReach(int[] arr) {
        // code here
        int maxReach = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i > maxReach) {
                return false;
            }

            maxReach = Math.max(maxReach, i + arr[i]);

            if (maxReach >= arr.length - 1) {
                return true;
            }
        }

        return false;
    }
}