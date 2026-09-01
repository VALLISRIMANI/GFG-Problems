class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = arr.length;
        if (n < 4) return result;

        Arrays.sort(arr);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;

                int left = j + 1, right = n - 1;

                while (left < right) {
                    long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];

                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        result.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[left], arr[right])));
                        left++;
                        right--;

                        while (left < right && arr[left] == arr[left - 1]) left++;
                        while (left < right && arr[right] == arr[right + 1]) right--;
                    }
                }
            }
        }

        return result;
    }
}