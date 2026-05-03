class GetMin {
    public static Stack<Integer> _push(int arr[], int n) {
        // code here
        Stack<Integer> s = new Stack<>();
        int min = Integer.MAX_VALUE;
        
        for (int num : arr) {
            min = Math.min(min, num);
            s.push(min);
        }
        
        return s;
    }

    static void _getMinAtPop(Stack<Integer> s) {
        // code here
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
}