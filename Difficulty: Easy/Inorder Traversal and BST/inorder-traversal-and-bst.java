// User function Template for Java

class Solution {
    static int isRepresentingBST(int arr[], int N) {
        // code here
        for (int i = 1; i < N; i++) {
            if (arr[i - 1] > arr[i]) {
                return 0;
            }
        }
        
        return 1;
    }
}