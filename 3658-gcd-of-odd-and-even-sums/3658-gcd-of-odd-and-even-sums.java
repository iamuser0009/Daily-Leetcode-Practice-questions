class Solution {
    public int gcdOfOddEvenSums(int n) {
        //sum of first n even numbers = n*(n+1)
        int even = n*(n+1);
        //sum of first n odd numbers = n*n;
        int odd = n*n;
        for( int i=odd; i>=0 ; i--){
            if(odd%i ==0 && even%i==0)return i;
        }
        return 1;
        
    }
}