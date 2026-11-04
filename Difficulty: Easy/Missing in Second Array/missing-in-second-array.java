class Solution {
    ArrayList<Integer> findMissing(int[] a, int[] b) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<>();
        
        for (int num : b) {
            set.add(num);
        }
        
        
        for (int num : a) {
            if (!set.contains(num)) {
                result.add(num);
            }
        }
        
        return result;
    }
}