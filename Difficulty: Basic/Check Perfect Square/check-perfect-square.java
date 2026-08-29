class Solution {
    public boolean isPerfectSquare(int n) {
        // code here
        int temp = (int) Math.sqrt(n);
        
        return (temp * temp) == n;
    }
}