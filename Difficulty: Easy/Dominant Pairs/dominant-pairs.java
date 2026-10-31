class Solution {
    public int dominantPairs(int[] arr) {
        // Code here
        int n = arr.length;
        int mid = n / 2;

        int[] first = Arrays.copyOfRange(arr, 0, mid);
        int[] second = Arrays.copyOfRange(arr, mid, n);

        Arrays.sort(first);
        Arrays.sort(second);

        int count = 0;
        int i = 0;

        for (int j = 0; j < second.length; j++) {
            while (i < mid && first[i] < 5L * second[j]) {
                i++;
            }

            count += (mid - i);
        }

        return count;
    }
}