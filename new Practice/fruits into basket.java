class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int m = baskets.length;
        boolean[] used = new boolean[m];  // to mark used baskets
        int unplaced = 0;

        for (int fruit : fruits) {
            boolean placed = false;
            for (int i = 0; i < m; i++) {
                if (!used[i] && baskets[i] >= fruit) {
                    used[i] = true;
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                unplaced++;
            }
        }

        return unplaced;
    }
}
