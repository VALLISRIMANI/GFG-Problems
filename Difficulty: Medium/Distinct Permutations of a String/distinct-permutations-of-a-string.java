class Solution {
    static ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> result = new ArrayList<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        backtrack(chars, new boolean[s.length()], new StringBuilder(), result);
        return result;
    }

    public static void backtrack(char[] chars, boolean[] used, StringBuilder current, ArrayList<String> result) {
        if (current.length() == chars.length) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (used[i]) {
                continue;
            }
            
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) {
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