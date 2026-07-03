class Solution {
    int[] dp ;
    public int fib(int n) {
     dp = new int[n+1];
    return dynamic(n);
        
    }
    public int dynamic(int  n){
        if(n<=1) return n;
        if(dp[n] != 0) return dp[n];
        // else{
            dp[n] = dynamic(n-1) +dynamic(n-2);
        // }
        return dp[n];
    }
}