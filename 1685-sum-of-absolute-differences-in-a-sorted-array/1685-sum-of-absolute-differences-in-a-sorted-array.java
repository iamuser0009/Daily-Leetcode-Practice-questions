class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] prefixsum = new int[nums.length+1];
        prefixsum[0] =0;
        for( int i=1; i<=nums.length; i++){
            prefixsum[i] = prefixsum[i-1]+nums[i-1];
        }

        int totalsum = prefixsum[prefixsum.length -1];
        int[] arr = new int[nums.length];

        for(int i=0; i<nums.length; i++)
        {
            int leftsum = prefixsum[i];
            int leftContribution = Math.abs(leftsum - nums[i] *i);
            int rightsum = totalsum - prefixsum[i+1];
            int rightContribution = rightsum - nums[i] * (nums.length-1-i);
            arr[i] = leftContribution +  rightContribution;
        }
        return arr;
    }
}