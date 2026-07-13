class Solution {
    static int lis(int arr[]) {
        // code here
        int n = arr.length;
        int[] result = new int[n];
        result[0] = arr[0];
        int len = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > result[len - 1]) {
                result[len] = arr[i];
                len++;
            } else {
                int low = Arrays.binarySearch(result, 0, len, arr[i]);
                if (low < 0) {
                    low = -(low + 1);
                }
                result[low] = arr[i];
            }
        }

        return len;
    }
}