class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        int max = 0;

        for (int num : arr) {
            max = Math.max(max, num);
        }

        boolean[] present = new boolean[max + 1];

        for (int num : arr) {
            present[num] = true;
        }

        for (int a = 1; a <= max; a++) {
            if (!present[a]) continue;

            for (int b = a; b <= max; b++) {
                if (!present[b]) continue;

                int cSquared = a * a + b * b;
                int c = (int) Math.sqrt(cSquared);

                if (c <= max && c * c == cSquared && present[c]) {
                    if (a == b && count(arr, a) < 2) continue;
                    if (a == c && count(arr, a) < 2) continue;
                    if (b == c && count(arr, b) < 2) continue;
                    return true;
                }
            }
        }

        return false;
    }

    private int count(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) count++;
        }
        return count;
    }
}