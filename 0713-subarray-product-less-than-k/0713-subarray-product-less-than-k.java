class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if( nums.length ==1 && nums[0] <k) return 1; 
        int count =0;
        int product=1;
        int left =0;
        for( int i=0; i<nums.length; i++)
        {
          //if(nums[i] <k) count++;
          product *= nums[i];
          while(product >=k && left <nums.length){
            product = product/nums[left];
            left++;

        }
         int len = i-left+1;
          count += len;

        }
        return count;
        
    }
}