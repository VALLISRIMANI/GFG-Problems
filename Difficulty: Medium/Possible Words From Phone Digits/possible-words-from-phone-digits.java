class Solution {
    private static final String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public ArrayList<String> possibleWords(int[] arr) {
        // code here
        ArrayList<String> result = new ArrayList<>();

        if (arr.length == 0) return result;

        backtrack(arr, 0, new StringBuilder(), result);

        return result;
    }

    public void backtrack(int[] arr, int idx, StringBuilder current,  ArrayList<String> result) {
        if (idx == arr.length) {
            result.add(current.toString());
            return;
        }
        
        if (arr[idx] == 0 || arr[idx] == 1) {
            backtrack(arr, idx + 1, current, result);
            return;
        }

        String letters = map[arr[idx]];

        for (char ch : letters.toCharArray()) {
            current.append(ch);
            backtrack(arr, idx + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}