class Solution {
    public static String missingPanagram(String s) {
        // code here
        int[] count = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            
            count[ch - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (count[i] == 0) {
                sb.append((char) ('a' + i));
            }
        }
        
        return sb.isEmpty() ? "-1" : sb.toString();
    }
}
