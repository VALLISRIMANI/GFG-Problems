class Solution {
    public int countSubarray(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int count = 0;
        int subarraysCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count -= 1;
            if (arr[i] == 1) count += 1;

            if (map.containsKey(count)) {
                subarraysCount += map.get(count);
            }
            
            map.put(count, map.getOrDefault(count, 0) + 1);
        }
        
        return subarraysCount;
    }
}