class Solution {
    public int countAllDistinct(int[] arr) {
        // code here
        Set<Integer> distinctSet = new HashSet<>();
        for (int num : arr) {
            distinctSet.add(num);
        }
        
        int k = distinctSet.size(); 

        int n = arr.length;
        int count = 0;
        int left = 0;
        Map<Integer, Integer> windowMap = new HashMap<>();


        for (int right = 0; right < n; right++) {
            windowMap.put(arr[right], windowMap.getOrDefault(arr[right], 0) + 1);

            while (windowMap.size() == k) {

                count += (n - right); 

                windowMap.put(arr[left], windowMap.get(arr[left]) - 1);
                if (windowMap.get(arr[left]) == 0) {
                    windowMap.remove(arr[left]);
                }
                left++;
            }
        }

        return count;
    }
}