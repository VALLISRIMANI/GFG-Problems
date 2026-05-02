class Solution {
    static ArrayList<Integer> nextGreatest(int arr[]) {
        // code here
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>(n);
        
        for (int i = 0; i < n; i++) {
            result.add(0);
        }
        
        result.set(n - 1, -1);
        
        int max = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            result.set(i, max);
            max = Math.max(max, arr[i]);
        }
        
        return result;
    }
}