class Solution {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int maxcount =0;
        for( int i=0; i<k; i++)
        {
                char ch = s.charAt(i);
                if(vowels.indexOf(ch) != -1) maxcount++;
        }
        int count =maxcount;
        for( int i=k; i<s.length(); i++){
            char ch = s.charAt(i);
            if(vowels.indexOf(ch) != -1) count++;
            if(vowels.indexOf(s.charAt(i-k)) != -1) count--;
            maxcount  = Math.max(count, maxcount);


        }
        return maxcount;
        
    }
}