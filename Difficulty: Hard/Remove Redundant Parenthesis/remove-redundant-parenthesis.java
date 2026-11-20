class Solution {
    public String removeBrackets(String s) {
        // code here
        int n = s.length();
        boolean[] remove = new boolean[n];

        char[] leftOp = new char[n];
        char[] rightOp = new char[n];

        char last = '#';
        for (int i = 0; i < n; i++) {
            leftOp[i] = last;
            char ch = s.charAt(i);
            if (isOperator(ch)) last = ch;
        }

        char next = '#';
        for (int i = n - 1; i >= 0; i--) {
            rightOp[i] = next;
            char ch = s.charAt(i);
            if (isOperator(ch)) next = ch;
        }

        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Boolean> hasPlusMinus = new ArrayDeque<>();
        Deque<Boolean> hasMulDiv = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);
                hasPlusMinus.push(false);
                hasMulDiv.push(false);
            } else if (ch == '+' || ch == '-') {
                if (!hasPlusMinus.isEmpty()) {
                    hasPlusMinus.pop();
                    hasPlusMinus.push(true);
                }
            } else if (ch == '*' || ch == '/') {
                if (!hasMulDiv.isEmpty()) {
                    hasMulDiv.pop();
                    hasMulDiv.push(true);
                }
            } else if (ch == ')') {
                int openIdx = stack.pop();
                boolean pm = hasPlusMinus.pop();
                boolean md = hasMulDiv.pop();

                char left = leftOp[openIdx];
                char right = rightOp[i];

                boolean needed = false;
                
                if (pm && (left == '*' || left == '/' || right == '*' || right == '/')) {
                    needed = true;
                }
                
                if (left == '-' && pm) {
                    needed = true;
                }
                
                if (left == '/' && (pm || md)) {
                    needed = true;
                }

                if (!needed) {
                    remove[openIdx] = true;
                    remove[i] = true;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (!remove[i]) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    private boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
}