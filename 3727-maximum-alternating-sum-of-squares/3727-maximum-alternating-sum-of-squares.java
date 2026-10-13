class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] sq = new long[n];
        for( int i=0; i<nums.length; i++)
        {
            sq[i] = (long) nums[i]*nums[i];
        }
        Arrays.sort (sq);
        long evenpossum = 0;
        for ( int i=n/2; i<n; i++)
        {
            evenpossum += sq[i];
        }
        long oddpossum =0;
        for( int i=0; i<n/2; i++)
        {
            oddpossum += sq[i];
        }
        return evenpossum - oddpossum;
        
    }
}