// User function Template for Java
class Solution {
    static void printPattern(int N) {
        // code here
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
}