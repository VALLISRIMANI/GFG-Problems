class Solution {
    boolean isBinary(String s) {
        // Your code here
        char[] nums = s.toCharArray();
        
        for (char ch : nums) {
            if (ch != '0' && ch != '1') return false;
        }
        
        return true;
    }
}