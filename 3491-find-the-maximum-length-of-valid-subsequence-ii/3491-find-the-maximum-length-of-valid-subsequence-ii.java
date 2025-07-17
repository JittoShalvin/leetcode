class Solution {
    public int maximumLength(int[] nums, int k) {
        int[][] dp = new int[k][k];
        int maxLen = 0;

        for (int num : nums) {
            for (int j = 0; j < k; ++j) {
                int remainder = num % k;
                dp[remainder][j] = dp[j][remainder] + 1;
                maxLen = Math.max(maxLen, dp[remainder][j]);
            }
        }

        return maxLen;
    }
}
