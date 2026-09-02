class Solution {
    public ArrayList<ArrayList<Integer>> mergeOverlap(int[][] arr) {
        // Code here
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        result.add(new ArrayList<>(Arrays.asList(arr[0][0], arr[0][1])));
        
        for (int i = 1; i < arr.length; i++) {
            ArrayList<Integer> current = result.get(result.size() - 1);
            int[] next = arr[i];
            
            if (next[0] <= current.get(1)) {
                current.set(1, Math.max(current.get(1), next[1]));
            } else {
                result.add(new ArrayList<>(Arrays.asList(arr[i][0], arr[i][1])));
            }
        }
        
        return result;
    }
}