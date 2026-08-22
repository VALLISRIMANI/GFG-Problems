class Solution {
    int search(String pat, String txt) {
        // code here
        int anagramsCount = 0;
        if (pat.length() > txt.length()) return anagramsCount;

        int[] freq = new int[26];
        for (char ch : pat.toCharArray()) {
            freq[ch - 'a']++;
        }

        int left = 0, right = 0, count = pat.length();

        while (right < txt.length()) {
            char ch = txt.charAt(right);

            if (freq[ch - 'a'] > 0) {
                count--;
            }

            freq[ch - 'a']--;
            right++;

            if (right - left > pat.length()) {
                char leftChar = txt.charAt(left);
                freq[leftChar - 'a']++;

                if (freq[leftChar - 'a'] > 0) {
                    count++;
                }

                left++;
            }

            if (count == 0) {
                anagramsCount++;
            }
        }

        return anagramsCount;
    }
}