class Solution {
    int[] dp;
    public int climbStairs(int n) {
        dp = new int[n+1];
        return dynamic(n);
    }
    public int dynamic( int n ){
    if( n<=1 ) return 1;
    if(n==2) return 2;
    if(dp[n] != 0) return dp[n];
    else{
        dp[n] = dynamic(n-1) + dynamic(n-2);
    }
    return dp[n];
    }
}