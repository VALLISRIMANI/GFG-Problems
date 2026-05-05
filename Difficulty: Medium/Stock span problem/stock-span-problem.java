class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        int n = arr.length;
        
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            
            result.add(stack.isEmpty() ? (i + 1) : (i - stack.peek()));
            stack.push(i);
        }
        
        return result;
    }
}