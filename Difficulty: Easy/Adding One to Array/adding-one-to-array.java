class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        // code here
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                
                Vector<Integer> result = new Vector<>();
                
                for (int num : arr) {
                    result.add(num);
                }
                
                return result;
            }

            arr[i] = 0;
        }

        Vector<Integer> result = new Vector<>();
        result.add(1);

        for (int i = 0; i < n; i++) {
            result.add(0);
        }

        return result;
    }
}