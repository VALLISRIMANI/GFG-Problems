class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        // code here
        long totalEven = 0, totalOdd = 0;
        
        boolean isEven = date % 2 == 0 ? true : false;
        
        for (int i = 0; i < car.length; i++) {
            if (isEven && car[i] % 2 != 0) {
                totalEven += fine[i];
            } else if (!isEven && car[i] % 2 == 0) {
                totalOdd += fine[i];
            }
        }
        
        return isEven ? totalEven : totalOdd;
    }
}