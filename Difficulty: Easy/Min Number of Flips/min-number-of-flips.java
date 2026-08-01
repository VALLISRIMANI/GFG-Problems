class Solution {
    public int minFlips(String s) {
        // Code here
        int flipsStartWith0 = 0; 
        int flipsStartWith1 = 0; 
        
        for (int i = 0; i < s.length(); i++) {
            char expected0 = (i % 2 == 0) ? '0' : '1';
            char expected1 = (i % 2 == 0) ? '1' : '0';
            
            if (s.charAt(i) != expected0) flipsStartWith0++;
            if (s.charAt(i) != expected1) flipsStartWith1++;
        }
        
        return Math.min(flipsStartWith0, flipsStartWith1);
    }
}