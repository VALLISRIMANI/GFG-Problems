class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        double d = (b * b) - (4 * a * c);
        
        if(d < 0){
            result.add(-1);
        } else {
            int x = (int)Math.floor((-1 * b + Math.sqrt(d)) / (2 * a));
            int y = (int)Math.floor((-1 * b - Math.sqrt(d)) / (2 * a));
            result.add(Math.max(x, y));
            result.add(Math.min(x, y));
        }
        
        return result;
    }
}