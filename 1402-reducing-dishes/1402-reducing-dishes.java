class Solution {
    int[][] dp;
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n = satisfaction.length;
        dp = new int [n+1][n+2];
         for (int[] row : dp) Arrays.fill(row, Integer.MIN_VALUE);
       
        return function(0, satisfaction, 1, n);
    }

    public int function(int i, int[] satisfaction, int time, int n) {
        if (i >=n ) return 0;
        
        if (dp[i][time] != Integer.MIN_VALUE) return dp[i][time];
        
        int select = satisfaction[i] * time + function(i + 1, satisfaction, time + 1, n);

        int notselect = function(i + 1, satisfaction, time, n);
       

        return dp[i][time] =Math.max(select, notselect);
        
    }
}