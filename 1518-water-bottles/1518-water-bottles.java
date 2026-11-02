class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans =numBottles;
        while(numBottles >= numExchange){
            int bottlegained = numBottles/ numExchange;
            int bottleleft = numBottles% numExchange;
            ans+= bottlegained;
            numBottles = bottlegained  + bottleleft;
        }
        return ans;

        
    }
}