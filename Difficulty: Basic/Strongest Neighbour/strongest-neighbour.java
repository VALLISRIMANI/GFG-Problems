class Solution {
    public ArrayList<Integer> maxAdj(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.length - 1; i++) {
            result.add(Math.max(arr[i], arr[i + 1]));
        }
        
        return result;
    }
};