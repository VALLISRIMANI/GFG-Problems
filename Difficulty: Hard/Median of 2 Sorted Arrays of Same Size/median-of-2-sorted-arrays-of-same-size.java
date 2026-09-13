class Solution {
    public double medianOf2(int a[], int b[]) {
        // Your Code Here
        int n = a.length;
        
        if (n == 1) return (a[0] + b[0]) / 2.0;
        
        int i = 0, j = 0;
        int previous = 0, current = 0;
        
        for (int count = 0; count <= n; count++) {
            previous = current;
            
            if (i < n && j < n) {
                if (a[i] <= b[j]) {
                    current = a[i];
                    i++;
                } else {
                    current = b[j];
                    j++;
                }
            } else if (i < n) {
                current = a[i];
                i++;
            } else {
                current = b[j];
                j++;
            }
        }
        
        return (previous + current) / 2.0;
    }
}