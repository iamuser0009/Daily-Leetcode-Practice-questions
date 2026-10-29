class Solution {
    int[][] dp;

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0)
            return false;
        dp = new int[nums.length][sum / 2 + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return function(nums, 0, sum / 2);

    }

    public boolean function(int[] nums, int i, int target) {
        //basecase
        if (target == 0) {
            return true;
        }

        if (i >= nums.length) return false;

        if( dp[i][target] != -1)
        {
            return dp[i][target] ==1;
        }
        boolean take = false;
        if( nums[i] <= target) take = function(nums, i + 1, target - nums[i]);
        boolean skip = function(nums, i + 1, target);
        dp[i][target] = take || skip ? 1 : 0;

        return dp[i][target] ==1;

    }
}