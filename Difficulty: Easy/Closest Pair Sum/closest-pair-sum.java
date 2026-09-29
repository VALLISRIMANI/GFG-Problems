class Solution {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        // code here
        int n = arr.length;

        ArrayList<Integer> result = new ArrayList<>();
        if (n == 1) return result;

        Arrays.sort(arr);

        int i = 0, j = n - 1;

        int bestDiff = Integer.MAX_VALUE;
        int bestPairDifference = -1;

        while (i < j) {
            int sum = arr[i] + arr[j];
            int diff = Math.abs(target - sum);
            int pairDifference = Math.abs(arr[i] - arr[j]);

            if (diff < bestDiff) {
                bestDiff = diff;
                bestPairDifference = pairDifference;

                result.clear();
                result.add(arr[i]);
                result.add(arr[j]);
            } else if (diff == bestDiff) {
                if (pairDifference > bestPairDifference) {
                    bestPairDifference = pairDifference;

                    result.clear();
                    result.add(arr[i]);
                    result.add(arr[j]);
                }
            }

            if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return result;
    }
}