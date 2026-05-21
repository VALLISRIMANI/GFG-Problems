// User function Template for Java

class Solution {
    ArrayList<Integer> primeRange(int M, int N) {
        // code here
        boolean p[] = new boolean[N + 1];
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i <= N; i++)
            p[i] = true;
        p[0] = false;
        p[1] = false;
        
        for (int i = 2; i * i <= N; i++) {
            if (p[i]) {
                for (int j = i * i; j <= N; j += i)
                    p[j] = false;
            }
        }
        
        for (int i = M; i <= N; i++) {
            if (p[i])
                list.add(i);
        }
        
        return list;
    }
}