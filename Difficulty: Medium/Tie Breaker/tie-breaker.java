// User function Template for Java

class Solution {
    public static String TieBreak(String arr[]) {
        // Your code here
        /*
        TreeMap<String, Integer> map = new TreeMap<>();
        
        for (String str : arr) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        
        String winner = "";
        int maxVotes = -1;
        
        for (String key : map.keySet()) {
            int votes = map.get(key);
            if (votes > maxVotes) {
                maxVotes = votes;
                winner = key;
            }
        }
        
        return winner;
        */
        
        Map<String, Integer> map = new HashMap<>();
        
        for (String str : arr) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        
        String winner = "";
        int maxVotes = -1;
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String candidate = entry.getKey();
            int votes = entry.getValue();
            if (votes > maxVotes || (votes == maxVotes && candidate.compareTo(winner) < 0)) {
                maxVotes = votes;
                winner = candidate;
            }
        }
        
        return winner;
    }
}