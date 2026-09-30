class Solution {
    public int substrCount(String s, int k) {
        // code here
        /*
        if (s == null || s.length() < k) {
            return 0;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, count = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            
            if (map.size() >= k || (right - left + 1) > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                
                left++;
            }
            
            if ((right - left + 1) == k && map.size() == k - 1) {
                count++;
            }
            
        }
        
        return count;
        */
        
        if (s == null || s.length() < k) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, count = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            if (right - left + 1 == k) {
                if (map.size() == k - 1) {
                    count++;
                }

                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                
                left++;
            }
        }

        return count;
    }
}