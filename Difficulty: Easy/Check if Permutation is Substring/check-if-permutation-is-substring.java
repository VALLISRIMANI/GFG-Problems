class Solution {
    boolean search(String txt, String pat) {
        // Write your code here
        int n = txt.length();
        int k = pat.length();
        
        int[] patFreq = new int[26];
        int[] winFreq = new int[26];
        
        for (int i = 0; i < k; i++) {
            patFreq[pat.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < n; i++) {
            winFreq[txt.charAt(i) - 'a']++;
            
            if (i >= k) {
                winFreq[txt.charAt(i - k) - 'a']--;
            }
            
            if (i >= k - 1 && Arrays.equals(patFreq, winFreq)) {
                return true;
            }
        }
        
        return false;
    }
}