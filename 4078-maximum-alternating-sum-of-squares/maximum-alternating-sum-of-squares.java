class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        int[] sq = new int[n];
        for (int i = 0; i < n; i++) {
            sq[i] = nums[i] * nums[i];
        }
        Arrays.sort(sq);

        int k = n / 2; 
        long res = 0;
        
        for (int i = k; i < n; i++) {
            res += sq[i];
        }
         for (int i = 0; i < k; i++) {
            res -= sq[i];
        }
        return res;
    }
}