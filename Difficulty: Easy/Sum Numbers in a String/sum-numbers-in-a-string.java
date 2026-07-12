class Solution {
    public static int findSum(String s) {
        // code here
        int sum = 0;

        while (!s.isEmpty()) {
            int i = 0;
            while (i < s.length() && !Character.isDigit(s.charAt(i))) {
                i++;
            }

            if (i == s.length()) break;

            int j = i;
            while (j < s.length() && Character.isDigit(s.charAt(j))) {
                j++;
            }

            sum += Integer.parseInt(s.substring(i, j));
            s = s.substring(j);
        }
        
        return sum;
    }
}