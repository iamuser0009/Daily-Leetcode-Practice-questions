class Solution {
    public int reverseDegree(String s) {
        int sum =0;
        for( int i=0; i< s.length(); i++)
        {
            int index = s.charAt(i) - 'a';
            int revidx = 26 - index;
            sum += (i+1) * revidx;
        }
        return sum;
        
    }
}