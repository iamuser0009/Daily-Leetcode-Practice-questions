class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> visited = new HashSet<>();
        HashSet<Integer> unique = new HashSet<>();
        // for( int i= 0; i<nums.length; i++){
        //     set1.add(nums[i]);
        // }
        for( int i=0; i< nums.length; i++)
        {
            if(visited.contains(nums[i]-k))
            unique.add(nums[i]-k);
            if(visited.contains(nums[i]+k))
            unique.add(nums[i]);
            visited.add(nums[i]);
        }
        return unique.size();
    }
}