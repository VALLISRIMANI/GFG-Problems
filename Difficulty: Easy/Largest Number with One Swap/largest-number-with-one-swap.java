class Solution {
    public String largestSwap(String s) {
        // code here
        char[] arr = s.toCharArray();
        int n = arr.length;

        int[] maxRight = new int[n];
        maxRight[n - 1] = n - 1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[maxRight[i + 1]]) {
                maxRight[i] = i;
            } else {
                maxRight[i] = maxRight[i + 1];
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[maxRight[i + 1]]) {
                char temp = arr[i];
                arr[i] = arr[maxRight[i + 1]];
                arr[maxRight[i + 1]] = temp;
                break;
            }
        }

        return new String(arr);
    }
}