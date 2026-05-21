// User function Template for Java

class Solution {
    public String reverseString(String s) {
        // code here.
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            
            if (ch == ' ') continue;
            
            if (!set.contains(ch)) {
                sb.append(ch);
            }
            
            set.add(ch);
        }
        
        return sb.toString();
    }
}