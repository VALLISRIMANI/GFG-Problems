class Solution {
    static String conRevstr(String s1, String s2) {
        // code here
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        sb1.append(sb2);
        
        return sb1.reverse().toString();
    }
}