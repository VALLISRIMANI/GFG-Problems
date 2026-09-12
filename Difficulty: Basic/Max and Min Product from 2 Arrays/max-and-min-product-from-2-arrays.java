
class Solution {

    public long minMaxProduct(int[] arr1, int[] arr2) {
        // code here
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return (long) arr1[arr1.length - 1] * arr2[0];
    }
}