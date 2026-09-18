class Solution {
    public String printNumber(String s) {
        // code here
        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch <= 'c')
                ans.append('2');
            else if (ch <= 'f')
                ans.append('3');
            else if (ch <= 'i')
                ans.append('4');
            else if (ch <= 'l')
                ans.append('5');
            else if (ch <= 'o')
                ans.append('6');
            else if (ch <= 's')
                ans.append('7');
            else if (ch <= 'v')
                ans.append('8');
            else
                ans.append('9');
        }

        return ans.toString();
    }
}