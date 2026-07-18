class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int smaller = nums[0];
        int larger = nums[nums.length-1];
        for( int i= smaller ; i>=1; i--){
            if(larger%i ==0 && smaller%i ==0)return i;
        }
        return 1;
        
    }
}