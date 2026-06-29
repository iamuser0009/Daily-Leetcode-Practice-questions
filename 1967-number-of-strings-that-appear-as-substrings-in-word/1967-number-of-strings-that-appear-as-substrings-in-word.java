class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count =0;
        for( int i=0;i<patterns.length; i++){
            String str = patterns[i];
            if(word.indexOf(str) != -1) count++;
        }
        return count;
        
    }
}