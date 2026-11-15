class Solution {
    static long jumpingNums(long n) {
        // code here
        long maxJumping = 0;

        // BFS for each starting digit from 1 to 9
        for (int i = 1; i <= 9 && i <= n; i++) {
            Queue<Long> queue = new LinkedList<>();
            queue.add((long) i);

            while (!queue.isEmpty()) {
                long curr = queue.poll();

                if (curr <= n) {
                    maxJumping = Math.max(maxJumping, curr);

                    long lastDigit = curr % 10;

                    // If last digit is greater than 0, we can append (lastDigit - 1)
                    if (lastDigit > 0) {
                        long nextNum = curr * 10 + (lastDigit - 1);
                        if (nextNum <= n) {
                            queue.add(nextNum);
                        }
                    }

                    // If last digit is less than 9, we can append (lastDigit + 1)
                    if (lastDigit < 9) {
                        long nextNum = curr * 10 + (lastDigit + 1);
                        if (nextNum <= n) {
                            queue.add(nextNum);
                        }
                    }
                }
            }
        }

        return maxJumping;
    }
}