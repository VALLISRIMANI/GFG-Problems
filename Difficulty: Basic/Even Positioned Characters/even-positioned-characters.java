class Solution {
    public static void utility(String s) {
        // code here
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i]);
            }
        }
    }
}