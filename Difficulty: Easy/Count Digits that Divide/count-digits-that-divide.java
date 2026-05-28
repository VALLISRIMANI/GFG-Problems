// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count = 0;
        String s = String.valueOf(n);
        for (char c : s.toCharArray()) {
            int d = c - '0';
            if (d != 0 && n % d == 0) {
                count++;
            }
        }
        return count;
    }
}