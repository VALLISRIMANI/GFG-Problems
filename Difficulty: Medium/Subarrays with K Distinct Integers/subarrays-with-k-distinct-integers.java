class Solution {
    public int exactlyK(int arr[], int k) {
        // code here
        Map<Integer, Integer> count = new HashMap<>();
        int left = 0, result = 0, distinct = 0;

        for (int right = 0; right < arr.length; right++) {
            count.put(arr[right], count.getOrDefault(arr[right], 0) + 1);
            if (count.get(arr[right]) == 1) distinct++;

            while (distinct > k) {
                count.put(arr[left], count.get(arr[left]) - 1);
                if (count.get(arr[left]) == 0) distinct--;
                left++;
            }

            // Count subarrays with exactly k distinct elements
            if (distinct == k) {
                int tempLeft = left;
                while (distinct == k) {
                    result++;
                    count.put(arr[tempLeft], count.get(arr[tempLeft]) - 1);
                    if (count.get(arr[tempLeft]) == 0) distinct--;
                    tempLeft++;
                }
                // Restore counts for next iteration
                for (int i = left; i < tempLeft; i++) {
                    count.put(arr[i], count.getOrDefault(arr[i], 0) + 1);
                    if (count.get(arr[i]) == 1) distinct++;
                }
            }
        }

        return result;
    }
}
