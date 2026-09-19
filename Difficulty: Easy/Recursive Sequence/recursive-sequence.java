class Solution {
    
    static final long MOD = 1000000007L;
    long num = 1;
    
    public int sequence(int n) {
        // code here
        return (int) solve(n, 1);
    }

    private long solve(int n, int term) {
        // Base case
        if (term > n)
            return 0;

        long product = 1;

        // Current term has 'term' numbers
        for (int i = 0; i < term; i++) {
            product = (product * num) % MOD;
            num++;
        }

        // Current term + remaining terms
        return (product + solve(n, term + 1)) % MOD;
    }
}