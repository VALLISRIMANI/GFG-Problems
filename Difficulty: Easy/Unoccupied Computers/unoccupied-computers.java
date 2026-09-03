class Solution {
    public int solve(int n, String s) {
        // code here
        Set<Character> set = new HashSet<>();
        Set<Character> rejected = new HashSet<>();
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (!set.contains(ch) && !rejected.contains(ch)) {
                if (set.size() < n) {
                    set.add(ch);
                } else {
                    count++;
                    rejected.add(ch);
                }
            } else {
                if (set.contains(ch)) {
                    set.remove(ch);
                }
            }
        }
        
        return count;
    }
}