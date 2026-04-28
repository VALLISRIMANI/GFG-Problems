class Solution {
    public int modInverse(int n, int m) {
        // code here
        int[] coeff = new int[2];
        int gcd = extendedGCD(n, m, coeff);

        if (gcd != 1) return -1; 

        int x = coeff[0];
        
        return (x % m + m) % m;
    }
    
    private int extendedGCD(int a, int b, int[] coeff) {
        if (b == 0) {
            coeff[0] = 1; 
            coeff[1] = 0; 
            return a;
        }
        int[] temp = new int[2];
        int gcd = extendedGCD(b, a % b, temp);
        coeff[0] = temp[1];
        coeff[1] = temp[0] - (a / b) * temp[1];
        return gcd;
    }
}