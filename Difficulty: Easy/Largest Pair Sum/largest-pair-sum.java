class Solution {
    public static int pairsum(int[] arr) {
        // code here
        int firstHighest = -1;
        int secondHighest = -1;
        
        for (int num : arr) {
            if (num > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = num;
            } else if (num > secondHighest) {
                secondHighest = num;
            }
        }
        
        return firstHighest + secondHighest;
    }
}