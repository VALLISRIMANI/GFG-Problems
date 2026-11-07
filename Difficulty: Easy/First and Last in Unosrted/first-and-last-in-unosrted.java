class Solution {
    public ArrayList<Integer> findIndex(int[] arr, int key) {
        // code here
        int start = -1, end = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (start == -1) start = i;
                end = i;
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(start);
        result.add(end);
        
        return result;
    }
};