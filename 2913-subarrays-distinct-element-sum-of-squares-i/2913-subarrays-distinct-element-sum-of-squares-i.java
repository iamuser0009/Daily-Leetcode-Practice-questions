class Solution {
    public int sumCounts(List<Integer> nums) {
        // number of subarrays possible if arraysize is n = [n*(n+1)]/2
        int answer =0;
        for( int i=0; i< nums.size(); i++)
        {
            HashSet<Integer> set = new HashSet<>();
           for( int j =i; j<nums.size(); j++){
            int num = nums.get(j);
            set.add(num);
             answer += set.size() * set.size();
           }
          
          
        }
       
        return answer;
        
    }
}