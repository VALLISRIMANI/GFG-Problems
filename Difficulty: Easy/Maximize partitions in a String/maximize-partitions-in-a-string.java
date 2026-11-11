class Solution {
    public int maxPartitions(String s) {
        // code here
        int[] lastIdx = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIdx[s.charAt(i) - 'a'] = i;
        }
        
        int partitionsCount = 0;
        int end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastIdx[s.charAt(i) - 'a']);
            
            if (i == end) {
                partitionsCount++;
            }
        }
        
        return partitionsCount;
    }
}