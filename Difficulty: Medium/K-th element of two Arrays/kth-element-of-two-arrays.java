class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int i = 0, j = 0, count = 0;
        
        while (i < a.length && j < b.length) {
            int value;
            
            if (a[i] < b[j]) {
                value = a[i];
                i++;
            } else {
                value = b[j];
                j++;
            }
            count++;
            
            if (count == k) {
                return value; 
            }
        }
        
        while (i < a.length) {
            count++;
            
            if (count == k) {
                return a[i];
            }
            
            i++;
        }
        
        while (j < b.length) {
            count++;
            
            if (count == k) {
                return b[j];
            }
            
            j++;
        }
        
        return -1;
    }
}