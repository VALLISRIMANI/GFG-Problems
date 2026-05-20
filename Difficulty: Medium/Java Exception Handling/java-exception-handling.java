// User function Template for Java

class Solution {
    public int findMin(int a, int b) {
        // Your code here
        int min = Integer.MAX_VALUE;
        min = Math.min(min, a + b);
        min = Math.min(min, a - b);
        min = Math.min(min, a * b); 
        
        try {
            int div = a / b;
            min = Math.min(min, div);
        } catch (ArithmeticException e) {
            // throw e;
        } 
        
        return min;
    }
}