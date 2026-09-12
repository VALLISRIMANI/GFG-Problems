class Solution {
    public ArrayList<Integer> xorArray(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            result.add(arr[i] ^ arr[i + 1]);
        }
        
        result.add(arr[n - 1]);
        return result;
    }
}