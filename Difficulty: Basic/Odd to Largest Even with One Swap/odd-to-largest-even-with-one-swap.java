class Solution {
    public String makeEven(String s) {
        // code here.
        char[] arr = s.toCharArray();
        int n = arr.length;

        char last = arr[n - 1];
        int evenIndex = -1;

        for (int i = 0; i < n - 1; i++) {
            if ((arr[i] - '0') % 2 == 0) {
                if (arr[i] < last) {
                    swap(arr, i, n - 1);
                    return new String(arr);
                }

                evenIndex = i;
            }
        }

        if (evenIndex == -1) {
            return s;
        }

        swap(arr, evenIndex, n - 1);

        return new String(arr);
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}