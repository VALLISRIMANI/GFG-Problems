// User function Template for Java

class Solution {
    String removeVowels(String s) {
        // code here
        Set<Character> vowels = new HashSet<>(Arrays.asList(
            'a','e','i','o','u'
        ));
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (!vowels.contains(ch)) {
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}