class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);  
            if (map.get(arr[i]) == 2) {
                result[idx++] = arr[i];
            }
        }
        
        return result;
    }
}