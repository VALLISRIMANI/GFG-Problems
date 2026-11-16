class Solution {
    int remainderWith7(String num) {
        // code here
        int result = 0;
        
        for(char ch : num.toCharArray()) {
            int digit = ch - '0';
            result = result * 10 + digit;
            result = result % 7;
        }
        
        return result;
    }
}