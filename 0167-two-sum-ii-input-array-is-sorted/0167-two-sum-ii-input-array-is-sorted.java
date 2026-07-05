class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int i=0;
        int j= nums.length-1;
        // while( nums[j] > target){
        //     j--;
        // }
        while( i<nums.length && j>=0){
            if(nums[i] + nums[j] >target) j--;
            else if( nums[i] +nums[j] < target) i++;
            else
            {
               arr[0] = i+1;
               arr[1] = j+1; 
               break;
            }
        }
        return arr;
        
    }
}