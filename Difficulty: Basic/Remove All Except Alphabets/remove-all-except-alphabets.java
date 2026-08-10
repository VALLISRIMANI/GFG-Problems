class Solution {
    public String removeChars(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch) || Character.isUpperCase(ch)) {
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
};