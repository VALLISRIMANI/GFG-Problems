class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
        int max = Integer.MIN_VALUE;
        for (int num : b) {
            max = Math.max(max, num);
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += a[i][j];
                }
            }
        }
        
        return new ArrayList<>(Arrays.asList(sum, max));
    }
}