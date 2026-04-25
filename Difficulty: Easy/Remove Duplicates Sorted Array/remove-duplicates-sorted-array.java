class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr[i]) {
                result.add(arr[i]);
            }
        }
        
        return result;
    }
}
