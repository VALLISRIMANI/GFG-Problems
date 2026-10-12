class Solution {
    ArrayList<Integer> ans = new ArrayList<>();
    
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        solve(0, 0, arr);
        return ans;
    }

    void solve(int index, int sum, int[] arr) {
        if (index == arr.length) {
            ans.add(sum);
            return;
        }

        solve(index + 1, sum + arr[index], arr);

        solve(index + 1, sum, arr);
    }
}