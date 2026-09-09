class Solution {
    public long countCommas(long n) {
        long sum =0;
        long threshold=1000;
        if( n<1000) return 0;
        for( int i=1;i<=5; i++)
        {
            if(n>=threshold)
            {
             sum+= n- threshold+1;
             threshold = threshold*1000;
            }
            
            
        }
        return sum;
        
    }
}