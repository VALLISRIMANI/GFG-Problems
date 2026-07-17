class Solution {
    static int RedOrGreen(int N, String S) {
        // code here
        int countRed = 0, countGreen = 0;
        
        for (char ch : S.toCharArray()) {
            if (ch == 'R') {
                countRed++;
            } else {
                countGreen++;
            }
        }
        
        return Math.min(countRed, countGreen);
    }
}