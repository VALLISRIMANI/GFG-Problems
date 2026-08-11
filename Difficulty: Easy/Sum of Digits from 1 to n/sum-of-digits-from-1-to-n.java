class Solution {
    public int sumOfDigits(int n) {
        // code here
        /* int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i < 10) {
                sum += i;
            } else {
                int num = i;
                int temp = 0;
                
                while (num > 0) {
                    temp += num % 10;
                    num /= 10;
                }
                
                sum += temp;
            }
        }
        
        return sum; */
        
        /* int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            int num = i;
            
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
        }
        
        return sum; */
        
        long sum = 0;

        for (long factor = 1; factor <= n; factor *= 10) {
            long higher = n / (factor * 10);
            long current = (n / factor) % 10;
            long lower = n % factor;

            sum += higher * 45 * factor;

            sum += (current * (current - 1) / 2) * factor;
            sum += current * (lower + 1);
        }

        return (int) sum;
    }
}