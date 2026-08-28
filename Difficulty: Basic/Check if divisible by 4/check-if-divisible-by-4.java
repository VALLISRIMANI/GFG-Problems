class Solution {
    boolean divisibleBy4(String s) {
        // code here
        int n = s.length();

        if (n == 1) {
            int d = s.charAt(0) - '0';
            return d % 4 == 0;
        }

        int lastTwo = (s.charAt(n - 2) - '0') * 10 + (s.charAt(n - 1) - '0');
        return lastTwo % 4 == 0;
    }
}
