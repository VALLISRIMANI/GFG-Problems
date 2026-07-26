class Solution {
    public int findNext(int n) {
        // your code here
        char[] digits = String.valueOf(n).toCharArray();
        int len = digits.length;

        int i = len - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        if (i < 0) {
            return -1;
        }

        int j = len - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        swap(digits, i, j);
        reverse(digits, i + 1, len - 1);

        long ans = Long.parseLong(new String(digits));

        return ans > Integer.MAX_VALUE ? - 1 : (int) ans;
    }

    private void swap(char[] digits, int i, int j) {
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }

    private void reverse(char[] digits, int i, int j) {
        while (i < j) {
            swap(digits, i, j);
            i++;
            j--;
        }
    }
}