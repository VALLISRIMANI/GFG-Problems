class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        /*
        TreeSet<Integer> min = new TreeSet<>();
        TreeSet<Integer> max = new TreeSet<>(Collections.reverseOrder());
        
        for (int price : prices) {
            min.add(price);
            max.add(price);
        }
        
        int minCost = 0;
         
        while (!min.isEmpty()) {
            minCost += min.pollFirst();
            
            for (int i = 0; i < k && !min.isEmpty(); i++) {
                min.pollLast();
            }
        }
        
        int maxCost = 0;
        
        while (!max.isEmpty()) {
            maxCost += max.pollFirst();
            
            for (int i = 0; i < k && !max.isEmpty(); i++) {
                max.pollLast();
            }
        }
        
        return new ArrayList<>(Arrays.asList(minCost, maxCost));
        */
        
        Arrays.sort(prices);

        int n = prices.length;

        int minCost = 0;
        int maxCost = 0;

        int i = 0, j = n - 1;

        while (i <= j) {
            minCost += prices[i];
            i++;
            j -= k;
        }

        i = 0;
        j = n - 1;

        while (i <= j) {
            maxCost += prices[j];
            j--;
            i += k;
        }

        return new ArrayList<>(Arrays.asList(minCost, maxCost));
    }
}
