class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int i=0; 
        int j= nums.length-1;
        while(i<=j){
            boolean left = isprime(nums[i]);
            boolean right = isprime(nums[j]);
            if(left == false) i++;
            if(right == false) j--;
            if(left == true && right == true) break;


        }
        return j-i;
    }
    public boolean isprime(int num){
        if(num ==1) return false;
        if(num ==2) return true;
        for(int i=2; i*i <=num; i++){
            if(num%i ==0) return false;
        }
        return true;
    }
}