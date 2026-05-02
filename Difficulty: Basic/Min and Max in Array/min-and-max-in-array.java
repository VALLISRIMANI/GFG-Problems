class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> result = new ArrayList<Integer>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        result.add(min);
        result.add(max);
        return result;
    }
}
