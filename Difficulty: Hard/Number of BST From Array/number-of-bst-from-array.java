class Solution {
    public ArrayList<Integer> countBSTs(int[] arr) {
        // Code here
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        
        int[] catalan = new int[n + 1];
        catalan[0] = 1;
        for (int i = 1; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - j - 1];
            }
        }
        
        for (int root : arr) {
            int left = 0, right = 0;
            for (int val : arr) {
                if (val < root) left++;
                else if (val > root) right++;
            }
            result.add(catalan[left] * catalan[right]);
        }
        
        return result;
    }
}