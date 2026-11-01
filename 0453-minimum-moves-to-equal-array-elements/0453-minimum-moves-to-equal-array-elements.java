class Solution {
    public int minMoves(int[] nums) {
        int sum =0;
        Arrays.sort(nums);
        int min = nums[0];
        for( int i=1; i<nums.length; i++)
        {
            sum +=nums[i]- min;   
        }
        return sum;
        
    }
}