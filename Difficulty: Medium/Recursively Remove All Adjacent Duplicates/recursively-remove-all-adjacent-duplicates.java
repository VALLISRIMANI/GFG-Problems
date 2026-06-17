class Solution {
    public String removeUtil(String s) {
        // code here
        if (s.length() <= 1) return s;

        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            int j = i + 1;
            
            while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                j++;
            }


            if (j == i + 1) {
                sb.append(s.charAt(i));
            }
            
            i = j;
        }

        String result = sb.toString();
        
        if (result.length() != s.length()) {
            return removeUtil(result);
        }
        
        return result;
    }
}
