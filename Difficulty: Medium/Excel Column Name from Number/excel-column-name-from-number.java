class Solution {
    public String colName(int n) {
        // code here
        StringBuilder sb = new StringBuilder();
        int num = n;
        
        while (num > 0) {
            num--;
            sb.append((char) ((num % 26) + 'A'));
            num /= 26;
        }        

        return sb.reverse().toString();
    }
}