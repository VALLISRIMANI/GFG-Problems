class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        // code here
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                ArrayList<Integer> temp = new ArrayList<>();

                for (int k = i; k <= j; k++) {
                    temp.add(arr[k]);
                }

                ans.add(temp);
            }
        }

        return ans;
    }
}