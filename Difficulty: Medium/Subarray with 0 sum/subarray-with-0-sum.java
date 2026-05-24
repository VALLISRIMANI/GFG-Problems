class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        int prefixSum = 0;

        for (int num : arr) {
            prefixSum += num;

            // Case 1: prefix sum is 0
            // Case 2: prefix sum already seen
            // Case 3: element itself is 0
            
            if (prefixSum == 0 || set.contains(prefixSum) || num == 0) {
                return true;
            }

            set.add(prefixSum);
        }
        
        return false;
    }
}