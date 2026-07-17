class Sol {
    int[] count(String s) {
        // your code here
        int lower = 0, upper = 0, special = 0, numeric = 0;
        
        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lower++;
            } else if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isDigit(ch)) {
                numeric++;
            } else {
                special++;
            }
        }
        
        return new int[]{upper, lower, numeric, special};
    }
}