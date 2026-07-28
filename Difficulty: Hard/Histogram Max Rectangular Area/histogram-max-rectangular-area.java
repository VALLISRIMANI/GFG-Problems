class Solution {
    public static int getMaxArea(int arr[]) {
        // code here
        int n = arr.length;
        int[] stack = new int[n + 1];
        int top = -1;
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : arr[i];

            while (top >= 0 && arr[stack[top]] > currentHeight) {
                int height = arr[stack[top--]];

                int leftBoundary = (top == -1) ? -1 : stack[top];
                int width = i - leftBoundary - 1;

                maxArea = Math.max(maxArea, height * width);
            }

            stack[++top] = i;
        }

        return maxArea;
    }
}
