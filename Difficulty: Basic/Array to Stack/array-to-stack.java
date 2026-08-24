class Solution {

    // Push elements of an array into a stack.
    public static Stack<Integer> push(int arr[]) {
        
        // code here
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            stack.push(num);
        }
        return stack;
    }

    // Print elements of a stack and pop them.
    public static void printAndPop(Stack<Integer> s) {
        // code here
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
}