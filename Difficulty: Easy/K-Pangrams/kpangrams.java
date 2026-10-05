class Solution {
    public boolean kPangram(String s, int k) {
        // code here
        int letters = 0;
        boolean[] seen = new boolean[26];
        int distinct = 0;

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                letters++;

                if (!seen[ch - 'a']) {
                    seen[ch - 'a'] = true;
                    distinct++;
                }
            }
        }

        if (letters < 26) {
            return false;
        }

        int missing = 26 - distinct;

        return missing <= k;
    }
}