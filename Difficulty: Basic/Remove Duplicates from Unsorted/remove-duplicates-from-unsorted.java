class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            if (!set.contains(num)) {
                result.add(num);
                set.add(num);
            }
        }
        
        return result;
    }
}