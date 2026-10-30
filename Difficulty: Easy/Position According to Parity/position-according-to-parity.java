class Solution {
    public static ArrayList<Integer> arrangeOddAndEven(int arr[]) {
        // code here
        int n = arr.length;

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        Integer[] ans = new Integer[n];

        int ei = 0, oi = 0;

        // Fill even positions
        for (int i = 0; i < n && ei < even.size(); i += 2) {
            ans[i] = even.get(ei++);
        }

        // Fill odd positions
        for (int i = 1; i < n && oi < odd.size(); i += 2) {
            ans[i] = odd.get(oi++);
        }

        // Fill remaining positions
        for (int i = 0; i < n; i++) {
            if (ans[i] == null) {
                if (ei < even.size()) {
                    ans[i] = even.get(ei++);
                } else {
                    ans[i] = odd.get(oi++);
                }
            }
        }

        return new ArrayList<>(Arrays.asList(ans));
    }
}