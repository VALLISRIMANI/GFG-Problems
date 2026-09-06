class Solution {
    public ArrayList<String> matchingStrings(ArrayList<String> d, String pat) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : pat.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        int patternSize = map.size();
        StringBuilder pattern = new StringBuilder();
        
        for (char ch : pat.toCharArray()) {
            pattern.append(map.get(ch));
        }
        
        ArrayList<String> result = new ArrayList<String>();
        for (String s : d) {
            if (s.length() != pat.length()) {
                continue;
            }
                        
            HashMap<Character, Integer> freqMap = new HashMap<>();
            
            for (char ch : s.toCharArray()) {
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }
            
            if (freqMap.size() != patternSize) {
                continue;
            }
            
            StringBuilder patternn = new StringBuilder();
        
            for (char ch : s.toCharArray()) {
                patternn.append(freqMap.get(ch));
            }
            
            boolean match = true;
            for (int i = 0; i < pattern.length(); i++) {
                if (pattern.charAt(i) != patternn.charAt(i)) {
                    match = false;
                    break;
                }
            }
            
            if (match) result.add(s);
        }
        
        return result;
    }
}