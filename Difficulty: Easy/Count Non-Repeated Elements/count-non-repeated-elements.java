class Solution {
    public int countNonRepeated(int arr[]) {
        //  code here
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        int count = 0;
        for (int value : freqMap.values()) {
            if (value == 1) {
                count++;
            }
        }
        
        return count;
    }
}