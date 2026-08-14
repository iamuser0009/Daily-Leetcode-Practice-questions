class Solution {
    public int maximumLengthSubstring(String s) {
        int maxlen = 0;
        int left = 0;
        int[] freq = new int[26];
        for ( int i=0; i<s.length() ; i++){
            int ch = s.charAt(i);
            int index = ch-'a';
            freq[index]++;
            while (freq[index] > 2) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }
            int len = i-left+1;
            maxlen = Math.max(maxlen, len);
        }
        return maxlen;
    }
}