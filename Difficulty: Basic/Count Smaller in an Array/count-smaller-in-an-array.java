
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // code here
        int count = 0;
        
        for (int num : arr) {
            if (num <= x) count++;
        }
        
        return count;
    }
}