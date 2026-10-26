class Solution {
    public int countPS(String s) {
        // code here
        int n = s.length();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int left = i;
            int right = i;

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 >= 2) result++;
                left--;
                right++;
            }

            left = i;
            right = i + 1;

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 >= 2) result++;
                left--;
                right++;
            }
        }

        return result;
    }
}