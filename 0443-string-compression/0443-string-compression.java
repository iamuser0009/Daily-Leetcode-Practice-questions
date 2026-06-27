class Solution {
    public int compress(char[] chars) {
        int i=0;
        int j=1;
        int count =0; 
        StringBuilder sb= new StringBuilder();
        while( j<chars.length)
        {
            if(chars[j] == chars[i])j++;
            else{
                int len = j-i;
                sb.append(chars[i]);
                if(len >1) sb.append(len);
                i=j;
                count=0;
            }
            

        }
        int len = j-i;
        sb.append(chars[i]);
        if(len >1) sb.append(len);

         for (int k = 0; k < sb.length(); k++) {
            chars[k] = sb.charAt(k);
        }
        return sb.length();

        
    }
}