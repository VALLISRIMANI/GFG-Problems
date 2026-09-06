class Solution {
    public int getSum(List<Integer> arr) {
        // code here
        boolean[] used = new boolean[arr.size()];
        return backtrack(arr, new StringBuilder(), used);
    }

    private int backtrack(List<Integer> arr, StringBuilder temp, boolean[] used) {
        if (temp.length() == arr.size()) {
            return Integer.parseInt(temp.toString());
        }

        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (used[i]) continue;
            
            used[i] = true;
            temp.append(arr.get(i));
            
            result += backtrack(arr, temp, used);
            
            temp.deleteCharAt(temp.length() - 1);
            used[i] = false;
        }
        
        return result;
    }
}