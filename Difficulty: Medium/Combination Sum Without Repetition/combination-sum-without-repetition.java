class Solution {
    public ArrayList<ArrayList<Integer>> uniqueCombinations(int[] arr, int target) {
        // code here
        Arrays.sort(arr);

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backtrack(arr, target, 0, new ArrayList<>(), result);

        return result;
    }

    private static void backtrack(int[] arr, int target, int start, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i < arr.length; i++) {

            if (i > start && arr[i] == arr[i - 1]) {
                continue;
            }

            if (arr[i] > target) {
                break;
            }

            curr.add(arr[i]);
            backtrack(arr, target - arr[i], i + 1, curr, result);
            curr.remove(curr.size() - 1);
        }
    }
}