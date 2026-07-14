class Solution {
    public String multiplyStrings(String s1, String s2) {
        // code here
        boolean negative = false;

        if (s1.charAt(0) == '-') {
            negative = !negative;
            s1 = s1.substring(1);
        }

        if (s2.charAt(0) == '-') {
            negative = !negative;
            s2 = s2.substring(1);
        }
        
        s1 = removeLeadingZeros(s1);
        s2 = removeLeadingZeros(s2);
        
        if (s1.equals("0") || s2.equals("0")) return "0";
        
        StringBuilder str1 = new StringBuilder(s1).reverse();
        StringBuilder str2 = new StringBuilder(s2).reverse();
        
        int m = str1.length(), n = str2.length();
        int[] result = new int[m + n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int digit = (str1.charAt(i) - '0') * (str2.charAt(j) - '0');
                
                result[i + j] += digit;
                
                result[i + j + 1] += result[i + j] / 10;
                result[i + j] %= 10;
            }
        }
        
        StringBuilder ans = new StringBuilder();

        int i = result.length - 1;
        while (i > 0 && result[i] == 0)
            i--;

        while (i >= 0)
            ans.append(result[i--]);

        if (negative)
            ans.insert(0, '-');

        return ans.toString();
    }

    private String removeLeadingZeros(String s) {
        int i = 0;

        while (i < s.length() - 1 && s.charAt(i) == '0')
            i++;

        return s.substring(i);
    }
}