class Solution {
    public int countLessEqual(int[] arr, int x) {
        // code here
        int n = arr.length;

        int low = 0, high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }

        int pivot = low;

        return upperBound(arr, 0, pivot - 1, x) + upperBound(arr, pivot, n - 1, x);
    }

    private int upperBound(int[] arr, int l, int r, int x) {
        if (l > r) return 0;

        int low = l, high = r + 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x)
                low = mid + 1;
            else
                high = mid;
        }

        return low - l;
    }
}