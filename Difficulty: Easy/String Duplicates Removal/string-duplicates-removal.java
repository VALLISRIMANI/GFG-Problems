// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256]; 

        for (char ch : s.toCharArray()) {
            if (!seen[ch]) {
                seen[ch] = true;
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}