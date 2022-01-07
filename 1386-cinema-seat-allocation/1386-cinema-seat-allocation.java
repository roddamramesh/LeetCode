class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Arrays.sort(reservedSeats, (int[] a, int[] b) -> a[0] - b[0]);

        int i = 0;
        int families = n * 2; // Assume that for all rows, 2 family can be arranged since if both side aisles can be occupied, there can be maximum 2 families per row

        while (i < reservedSeats.length) {
            families -= 2; // While processing a row, we will initially reduce families by 2 since earlier we assumed each row can have 2 family assigned, but in the below code, we will get to know how many actual families can be assigned to a particular row
            
            int j = i; // Since reservedSeats is sorted, find out all reservedSeats rows belonging to the same row
            while (j < reservedSeats.length && reservedSeats[j][0] == reservedSeats[i][0]) {
                j++;
            }

            // Find out if only left aisle assignment possible or right aisel or both aisle or none of the aisle but the middle of the row is possible. These flags will help is to find out actually how many families can be assigned to a row
            boolean leftPossible = true;
            boolean rightPossible = true;
            boolean midPossible = true;
            boolean twoFamilyPossible = true;

            for (int k = i; k < j; k++) {
                if (reservedSeats[k][1] >= 2 && reservedSeats[k][1] <= 5) {
                    leftPossible = false;
                }

                if (reservedSeats[k][1] >= 6 && reservedSeats[k][1] <= 9) {
                    rightPossible = false;
                }

                if (reservedSeats[k][1] >= 4 && reservedSeats[k][1] <= 7) {
                    midPossible = false;
                }
            }

            twoFamilyPossible = leftPossible && rightPossible;

            if (twoFamilyPossible) {
                families += 2;
            } else if (leftPossible || rightPossible || midPossible) {
                families++;
            }

            i = j;
        }

        return families;
    
    }
}