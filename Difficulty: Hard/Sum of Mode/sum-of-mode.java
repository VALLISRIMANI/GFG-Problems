class Solution {
    public int sumOfModes(int[] arr, int k) {
        // code here
        int n = arr.length;
        int modeSum = 0;
        
        Map<Integer, Integer> freq = new HashMap<>();
        TreeMap<Integer, TreeSet<Integer>> freqToVals = new TreeMap<>();
        
        for (int i = 0; i < n; i++) {
            int val = arr[i];

            if (freq.containsKey(val)) {
                int oldFreq = freq.get(val);
                freqToVals.get(oldFreq).remove(val);
                if (freqToVals.get(oldFreq).isEmpty()) freqToVals.remove(oldFreq);
            }

            int newFreq = freq.getOrDefault(val, 0) + 1;
            freq.put(val, newFreq);
            freqToVals.computeIfAbsent(newFreq, x -> new TreeSet<>()).add(val);

            if (i >= k) {
                int out = arr[i - k];
                int outFreq = freq.get(out);
                freqToVals.get(outFreq).remove(out);
                if (freqToVals.get(outFreq).isEmpty()) freqToVals.remove(outFreq);

                if (outFreq == 1) {
                    freq.remove(out);
                } else {
                    freq.put(out, outFreq - 1);
                    freqToVals.computeIfAbsent(outFreq - 1, x -> new TreeSet<>()).add(out);
                }
            }

            if (i >= k - 1) {
                int maxFreq = freqToVals.lastKey();
                int mode = freqToVals.get(maxFreq).first();
                modeSum += mode;
            }
        }
         
        return modeSum;
    }
}