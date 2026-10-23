class Solution {
     int count =0;
    public int findTargetSumWays(int[] nums, int target) {
        return function(nums, target, 0, 0);
    }
    public int function (int[] nums, int target, int sum, int i){
        
      if (i == nums.length) {
       if (sum == target) count++;
           return count;
        }
       
        function(nums, target,sum+nums[i], i+1 );
        function(nums, target, sum-nums[i], i+1);
        return count; 
        
    }
}