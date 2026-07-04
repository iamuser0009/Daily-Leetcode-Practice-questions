class Solution {
   
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return check(n, dp);

        
    }
    public int check(int n, int[] dp){
        if(n<=1) return n;
        if(n==2) return 1;
        if(dp[n] != -1) return dp[n];
        else{
            dp[n] =check(n-1, dp) +check(n-2, dp)+ check(n-3 , dp);
        }
        return dp[n];
    }
}