class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // code here
        int n = arr.length;
        int frequency = (int) Math.floor(n / 3);
        
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > frequency) {
                result.add(entry.getKey());
            }
        }
        
        Collections.sort(result);
        return result;
    }
}