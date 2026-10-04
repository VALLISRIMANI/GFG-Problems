class Solution {
    public ArrayList<String> generateParentheses(int n) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n / 2);
        return result;
    }
    
    private void backtrack(ArrayList<String> result, String current, int open, int close, int n) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        } 
        
        if (open < n) backtrack(result, current + "(", open + 1, close, n);
        if (close < open) backtrack(result, current + ")", open, close + 1, n);
    } 
}