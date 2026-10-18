class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        // code here
        Arrays.sort(arr);
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        int low = 0, high = arr.length - 1;
        
        while (low <= high) {
            if (low != high) {
                result.add(arr[high--]);
                result.add(arr[low++]);
            } else {
                result.add(arr[low]);
                low++;
            }
        }
        
        return result;
    }
}
