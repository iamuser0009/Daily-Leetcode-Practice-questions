class Solution {
    public int numTrees(int n) {
        if(n==1) return 1;
        int[] dp= new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] =2;
        
        for( int i=3; i<=n; i++){
            int left =0;
            int right= i-1;
            int sum =0;
            while(left<=right){
              if( left ==right ){
                sum +=(dp[left]*dp[left]);
                // dp[i] += sum;
              }
           
              else{
                sum+=(dp[left] *dp[right] )*2;
                // dp[i] = dp[i]+sum;
               }
               left++;
               right--;
            }
            dp[i] = sum;

        }

        return dp[n];
    }
}