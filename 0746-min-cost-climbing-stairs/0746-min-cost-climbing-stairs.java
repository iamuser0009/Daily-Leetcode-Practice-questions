class Solution {
    int[] cost;
    int[] dp ;
    public int minCostClimbingStairs(int[] cost) {
        this.cost = cost;
        dp = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(check(0),check(1));

        
    }
    public int check(int i){
        if(i>= cost.length ) return 0;
        if(dp[i] != -1 ) return dp[i];
         else{
            dp[i] = cost[i]+ Math.min(check(i+1), check(i+2));
         }
        return dp[i];

    }
}