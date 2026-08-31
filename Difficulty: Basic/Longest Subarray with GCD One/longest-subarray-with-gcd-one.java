class Solution {
    public int longestSubarray(int[] arr) {
        // code here
        int n = arr.length;
        int gcd = arr[0];

        for (int i = 1; i < n; i++) {
            gcd = findGCD(gcd, arr[i]);
        }

        if (gcd == 1) return n;

        return -1;
    }

    private int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }
}