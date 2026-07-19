class Solution {
    public static void pb(ArrayDeque<Integer> dq, int x) {
        //  code here
        dq.addLast(x);
    }

    public static void ppb(ArrayDeque<Integer> dq) {
        //  code here
        dq.pollLast();
    }

        
    public static int front_dq(ArrayDeque<Integer> dq) {
        //  code here
        return dq.isEmpty() ? -1 : dq.peek();
    }
        

    public static void pf(ArrayDeque<Integer> dq, int x) {
        //  code here
        dq.addFirst(x);
    }
}