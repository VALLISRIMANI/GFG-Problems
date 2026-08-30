class Geeks {
    static void enqueue(Queue<Integer> q, int k) {
        //  code here
        q.add(k);
    }

    static int findFrequency(Queue<Integer> q, int k) {
        //  code here
        int count = 0;
        
        for (int num : q) {
            if (num == k) count++;
        }
        
        return count;
    }
}