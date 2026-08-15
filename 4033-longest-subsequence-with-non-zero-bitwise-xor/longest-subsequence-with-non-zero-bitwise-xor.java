class Solution {
    public int longestSubsequence(int[] nums) {
        int res = 0;
        int count = nums.length;

        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }

        if (res != 0) {
            return count;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                return count - 1;
            }
        }

        return 0;
    }
}