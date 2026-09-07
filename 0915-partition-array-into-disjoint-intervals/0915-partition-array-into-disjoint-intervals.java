class Solution {
    public int partitionDisjoint(int[] nums) {
        int[] suffixmin = new int[nums.length];
        suffixmin[nums.length-1] = nums[nums.length-1];
        for( int i= nums.length-2; i>=0; i--)
        {
            suffixmin[i] = Math.min(nums[i], suffixmin[i+1]);
        }
        int max = nums[0];
        for( int i=0; i<nums.length-1; i++)
        {
            max = Math.max(nums[i], max);
            if( max <= suffixmin[i+1]) return i+1;
        }
        return 0;
        
    }
}