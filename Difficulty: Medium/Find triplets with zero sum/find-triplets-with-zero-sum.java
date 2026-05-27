class Solution {
    public boolean findTriplets(int[] arr) {
        // code here.
        int n = arr.length;
        if (n < 3) return false;
        
        for (int i = 0; i < n; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < arr.length; j++) {
                int currentTarget = 0 - (arr[i] + arr[j]);
                if (seen.contains(currentTarget)) {
                    return true;
                }
                seen.add(arr[j]);
            }
        }
        
        return false;
    }
}