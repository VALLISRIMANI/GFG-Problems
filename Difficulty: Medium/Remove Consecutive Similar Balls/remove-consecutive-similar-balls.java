class Solution {
    public int findLength(int[] color, int[] radius) {
        // code here
        int n = color.length;
        List<Integer> stackColor = new ArrayList<>();
        List<Integer> stackRadius = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int c = color[i];
            int r = radius[i];
            int size = stackColor.size();

            if (size > 0 && stackColor.get(size - 1) == c && stackRadius.get(size - 1) == r) {
                stackColor.remove(size - 1);
                stackRadius.remove(size - 1);
            } else {
                stackColor.add(c);
                stackRadius.add(r);
            }
        }

        return stackColor.size();
    }
}