// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        /*
        StringBuilder sb = new StringBuilder();
        
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        
        return sb.toString();
        */
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            sb.insert(0, s.charAt(i));
        }
        
        return sb.toString();
    }
}