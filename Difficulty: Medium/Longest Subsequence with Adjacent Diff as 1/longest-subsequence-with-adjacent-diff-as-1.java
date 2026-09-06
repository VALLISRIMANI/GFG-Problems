class Solution {
    public int longestSubseq(int[] arr) {
        // code here
        HashMap<Integer, Integer> dp = new HashMap<>();

        int maxLength = 0;
        for (int num : arr) {
            int left = dp.getOrDefault(num - 1, 0);
            int right = dp.getOrDefault(num + 1, 0);
            
            int length = Math.max(left, right) + 1;
            dp.put(num, length);

            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }
}