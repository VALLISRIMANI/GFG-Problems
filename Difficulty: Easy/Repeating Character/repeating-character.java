class Solution {
    static int repeatedCharacter(String S) {
        // code here
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (S.indexOf(ch) != S.lastIndexOf(ch)) {
                return i;
            }
        }
        
        return -1;
    }
}