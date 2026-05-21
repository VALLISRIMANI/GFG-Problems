
class Solution {
    public static long sumOfPowers(long a, long b) {
        // code here
        long total = 0;
        for(long i = a; i <= b; i++) {
            total += powerSum(i);
        }
        return total;
    }
    public static long powerSum(long num) {
        long count1 = 0, sum = 0;
        while(num % 2  == 0) {
            count1++;
            num /= 2;
        }
        sum += count1;
        for(long i = 3; i * i <= num; i += 2) {
            long count2 = 0;
            while(num % i == 0) {
                count2++;
                num /= i;
            }
            sum += count2;
        }
        if(num > 1) sum += 1;
        return sum;
    }
}