class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int l=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i])
                count++;
            else
                count=1;
            
            if(count<=2){
                nums[l]=nums[i];
                l++;
            }
        }
        return l;
    }
}