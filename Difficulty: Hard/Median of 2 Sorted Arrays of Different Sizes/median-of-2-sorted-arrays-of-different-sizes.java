class Solution {
    public double medianOf2(int a[], int b[]) {
        // Code Here
        int n = a.length + b.length;
        int[] arr = new int[n];
        int index = 0;

        for (int num : a) {
            arr[index++] = num;
        }
        for (int num : b) {
            arr[index++] = num;
        }

        Arrays.sort(arr);

        if (n % 2 == 0) {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            return arr[n / 2];
        }
    }
}