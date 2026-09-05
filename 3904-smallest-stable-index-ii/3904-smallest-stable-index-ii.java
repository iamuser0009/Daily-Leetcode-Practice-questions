class Solution {
    public int firstStableIndex(int[] nums, int k) {
        //using prefix and suffix array
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int maxpre = nums[0];
        int minsuf = nums[nums.length-1];
        
        int i=0;
        int j = nums.length-1;

        while( i <nums.length && j >=0)
        {
            maxpre = Math.max(maxpre, nums[i]);
            minsuf = Math.min(minsuf, nums[j]);
            prefix[i] = maxpre;
            suffix[j] = minsuf;
            i++;
            j--;
        }
       int ans = Integer.MAX_VALUE;
       for( i=0; i<nums.length; i++){
           if( (prefix[i] - suffix[i]) <=k ) return i;
       }
       return -1;

    }
}