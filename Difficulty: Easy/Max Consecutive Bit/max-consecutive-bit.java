class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int max = 0;
        int maxZeroes = 0;
        int maxOnes = 0;

        for (int num : arr) {
            if (num == 1) {
                maxOnes++;
                max = Math.max(max, maxOnes);
                maxZeroes = 0;
            } else {
                maxZeroes++;
                max = Math.max(max, maxZeroes);
                maxOnes = 0;
            }
        }

        return max;
    }
}
