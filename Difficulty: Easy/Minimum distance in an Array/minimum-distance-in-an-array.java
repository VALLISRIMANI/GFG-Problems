class Solution {
    int minDist(int arr[], int x, int y) {
        // code here
        int n = arr.length;
        int lastIndex = -1;
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x || arr[i] == y) {
                if (lastIndex != -1 && arr[i] != arr[lastIndex]) {
                    minDist = Math.min(minDist, i - lastIndex);
                }
                lastIndex = i;
            }
        }

        return (minDist == Integer.MAX_VALUE) ? -1 : minDist;
    }
}