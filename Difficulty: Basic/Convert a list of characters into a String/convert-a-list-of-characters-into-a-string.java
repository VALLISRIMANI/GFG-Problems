// User function Template for Java

class Solution {
    public String chartostr(char arr[], int N) {
        StringBuilder sb = new StringBuilder();
        
        for (char ch : arr) {
            sb.append(ch);
        }
        
        return sb.toString();
    }
}