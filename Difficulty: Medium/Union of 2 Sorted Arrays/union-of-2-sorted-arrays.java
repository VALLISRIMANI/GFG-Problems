class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        int m = a.length;
        int n = b.length;
        
        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();  
        while (i < m && j < n) {
            if (a[i] == b[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                    result.add(a[i]);
                }
                i++;
                j++;
            } else if (a[i] < b[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                    result.add(a[i]);
                }
                i++;
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != b[j]) {
                    result.add(b[j]);
                }
                j++;
            }
        }
        
        while (i < m) {
            if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                result.add(a[i]);
            }
            i++;
        }
        
        while (j < n) {
            if (result.isEmpty() || result.get(result.size() - 1) != b[j]) {
                result.add(b[j]);
            }
            j++;
        }
        
        return result;
    }
}
