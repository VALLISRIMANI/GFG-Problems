class Solution {
    public int countSum(int arr[], int target) {
        // code here
        /*
        int result = 0;
        
        int n = arr.length;
        if (n < 4) return result;

        Arrays.sort(arr);

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int left = j + 1, right = n - 1;

                while (left < right) {
                    long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];

                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        if (arr[left] == arr[right]) {
                            int m = right - left + 1;
                            
                            result += m * (m - 1) / 2;
                            break;
                        } else {
                            int countLeft = 1, countRight = 1;
                            
                            while (left + countLeft <= right && arr[left + countLeft] == arr[left]) {
                                countLeft++;
                            }
                            
                            while (right - countRight >= left && arr[right - countRight] == arr[right]) {
                                countRight++;
                            }
                            
                            result += countLeft * countRight;
                            left += countLeft;
                            right -= countRight;
                        }
                    }
                }
            }
        }

        return result;
        */
        
        int n = arr.length;
        Map<Long, Integer> map = new HashMap<>();
        int result = 0;
        
        for (int k = 2; k < n - 1; k++) {
            for(int i = 0; i < k - 1; i++) {
                long sum = (long) arr[i] + arr[k - 1];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            
            for (int l = k + 1; l < n; l++) {
                long secondSum = (long) arr[k] + arr[l];
                long need = (long) target - secondSum;
                
                result += map.getOrDefault(need, 0);
            }
        }
        
        return result;
    }
}