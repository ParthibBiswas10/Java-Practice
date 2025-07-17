import java.util.*;

class Solution {
    public int maximumLength(int[] nums, int k) {
        int n = nums.length;
        int maxLen = 1;

        // Array of maps: at each index i, store map of (mod) → length of longest subsequence ending at i
        @SuppressWarnings("unchecked")
        HashMap<Integer, Integer>[] dp = new HashMap[n];
        for (int i = 0; i < n; i++) dp[i] = new HashMap<>();

        for (int i = 0; i < n; i++) {
            dp[i].put(-1, 1); // Start a new subsequence from i

            for (int j = 0; j < i; j++) {
                int mod = (nums[i] + nums[j]) % k;

                int prevLen = dp[j].getOrDefault(mod, 1);
                int currLen = prevLen + 1;

                dp[i].put(mod, Math.max(dp[i].getOrDefault(mod, 0), currLen));
                maxLen = Math.max(maxLen, dp[i].get(mod));
            }
        }

        return maxLen;
    }
}
