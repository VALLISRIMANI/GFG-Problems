class Solution {
    public int totalElements(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = Integer.MIN_VALUE;
        int left = 0, right = 0, n = arr.length;
        
        while (right < n) {
            int num = arr[right];
            
            map.put(num, map.getOrDefault(num, 0) + 1);
            
            while (map.size() > 2) {
                int number = arr[left];
                map.put(number, map.get(number)- 1);
                
                if (map.get(number) == 0) {
                    map.remove(number);
                }
                
                left++;
            }
            
            if (map.size() <= 2) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            
            
            right++;
        }
        
        return maxLen == Integer.MIN_VALUE ? 0 : maxLen;
    }
}