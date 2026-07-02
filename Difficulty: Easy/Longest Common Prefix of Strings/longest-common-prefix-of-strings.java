// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        /* if (arr == null || arr.length == 0) return "";

        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {
            while (!arr[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
        */
        
        Arrays.sort(arr);

        String word1 = arr[0], word2 = arr[arr.length - 1];
        int i = 0;
        int length = Math.min(word1.length(), word2.length());

        StringBuilder sb = new StringBuilder();
        while (i < length) {
            if (word1.charAt(i) != word2.charAt(i)) {
                break;
            }
            sb.append(word1.charAt(i));
            i++;
        }
        
        return sb.toString();
    }
}