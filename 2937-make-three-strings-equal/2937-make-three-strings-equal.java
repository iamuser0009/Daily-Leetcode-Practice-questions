class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        //findind minimum string;
        int minimum = Math.min (s1.length(), Math.min(s2.length() , s3.length()));
        
        while( minimum > 0)
        {
           String sub= s1.substring(0, minimum);
           boolean one = (s1.substring(0, minimum).equals(sub));
           boolean two = (s2.substring(0, minimum).equals(sub));
           boolean three = (s3.substring(0, minimum).equals(sub));
           if(one && two && three ) break;
        //    if(s1.contains(sub) && s2.contains(sub) && s3.contains(sub)) break;
            else{
            minimum --;
           }
        }
        if(minimum ==0) return -1;
        return (s1.length()- minimum)+(s2.length()- minimum)+(s3.length()- minimum);
    }
}