class Solution {
    void printPat(int n) {
        // code here
        // Upper Half
        for (int i = 1; i <= n; i++) {
    
            // Leading spaces
            for (int j = n - 1; j >= i; j--) {
                System.out.print("  ");
            }
    
            // Stars and hollow spaces
            for (int k = 1; k <= i * 2 - 1; k++) {
                if (k == 1 || k == i * 2 - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
    
            System.out.println();
        }
    
        // Lower Half
        for (int i = n - 1; i >= 1; i--) {
    
            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
    
            // Stars and hollow spaces
            for (int k = 1; k <= i * 2 - 1; k++) {
                if (k == 1 || k == i * 2 - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
    
            System.out.println();
        }
    }
}