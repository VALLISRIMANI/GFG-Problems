class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        int sum = 0;
        
        for (int num : arr) {
            sum += num;
            result.add(sum);
        }
        
        return result;
    }
}