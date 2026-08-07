class Solution {
    public int maxChildren(int[] greed, int[] cookie) {
        // code here
        Arrays.sort(greed);
        Arrays.sort(cookie);

        int childrens = greed.length, cookies = cookie.length;
        int child = 0, cookiee = 0;

        while (child < childrens && cookiee < cookies) {
            if (cookie[cookiee] >= greed[child]) {
                child++;
            }
            cookiee++;
        }

        return child;
    }
}