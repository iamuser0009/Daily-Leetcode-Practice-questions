class Solution {
    public String longestPalindrome(String s) {
        // Using aerospace algorithm
        String res = "";

        // checking odd length palindrome

        for (int axis = 0; axis< s.length(); axis++) {
            int orbit = 1;
            int len = 1;
            while (axis - orbit >= 0 && axis + orbit < s.length()) {
                if (s.charAt(axis - orbit) == s.charAt(axis + orbit)) {
                    orbit++;
                    len += 2;
                } else {
                    break;
                }

            }
            if (len > res.length()) {
                res = s.substring(axis - orbit+1, axis + orbit);
            }

        }


        //checking even length palindrome
        for( int axis=0;axis < s.length()-1; axis++ ){
            int orbit=1;
            int len =0;
            while(axis-orbit+1 >=0 && axis+orbit < s.length()){
               if(s.charAt(axis-orbit+1)== s.charAt(axis+orbit)){
                len+=2;
                orbit++;

               }
               else{
                break;
               }
            }
            if(res.length() < len)
            {
                res = s.substring(axis- orbit+2, axis+orbit);
            }
        }

        return res;

    }
}