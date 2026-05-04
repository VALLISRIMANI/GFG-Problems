class Solution {
    public int minimumInteger(int[] arr) {
        // code here
        long sum = 0;
        
        for (int num : arr) {
            sum += num;
        }
        
        int result = Integer.MAX_VALUE;
        for (int num : arr) {
            long mul = (long) arr.length * num;
            if (sum <= mul) {
                result = Math.min(result, num);
            }
        }
        
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}