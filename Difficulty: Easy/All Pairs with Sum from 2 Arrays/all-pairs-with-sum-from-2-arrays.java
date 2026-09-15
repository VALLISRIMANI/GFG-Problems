/*
class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
*/

class Solution {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {
        // code here
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr2) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<pair> result = new ArrayList<>();
        for (int u : arr1) {
            int v = target - u;
            if (freq.containsKey(v)) {
                int count = freq.get(v);
                
                for (int i = 0; i < count; i++) {
                    result.add(new pair(u, v));
                }
            }
        }

        result.sort((p1, p2) -> Long.compare(p1.first, p2.first));

        return result.toArray(new pair[result.size()]);
    }
}