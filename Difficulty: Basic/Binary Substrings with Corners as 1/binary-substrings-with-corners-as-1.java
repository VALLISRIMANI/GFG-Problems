class Solution {
    public int binarySubstring(String s) {
        // code here
        int ones = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }
        
        return ones * (ones - 1) / 2;
    }
}