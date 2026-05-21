// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        // code here
        int largest = -1;
        while (n % 2 == 0) {
            largest = 2;
            n /= 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                largest = i;
                n /= i;
            }
        }
        if (n > 1) largest = n;
        return largest;
    }
}