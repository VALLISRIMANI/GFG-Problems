class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        /*
        ArrayList.contains() is an O(n) operation.
        Since you’re calling it inside a loop for every element of both arrays, 
        the overall complexity becomes O(n²) in the worst case, which is too 
        slow for large inputs.
        
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for (int num : a) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        
        for (int num : b) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        
        return result;
        */

        // We need an O(n + m) solution. The trick is to use a HashSet (constant-time lookup) instead of repeatedly scanning the ArrayList.
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : a) {
            set.add(num);
        }
        
        for (int num : b) {
            set.add(num);
        }
        
        ArrayList<Integer> result = new ArrayList<>(set);
        
        // Collections.sort(result);
        
        return result;
    }
}