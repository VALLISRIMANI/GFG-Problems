class Solution {
    public ArrayList<String> permutation(String s) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        backtrack(s.toCharArray(), new boolean[s.length()], new StringBuilder(), result);
        Collections.sort(result);
        return result;
    }
    
    public void backtrack(char[] chars, boolean[] used, StringBuilder current, ArrayList<String> result) {
        if (current.length() == chars.length) {
            result.add(current.toString());
            return;
        }
        
        for (int i = 0; i < chars.length; i++) {
            if (used[i]) {
                continue;
            }
            
            current.append(chars[i]);
            used[i] = true;
            
            backtrack(chars, used, current, result);
            
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }
}