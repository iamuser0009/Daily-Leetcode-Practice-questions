class Solution {
    public String sortVowels(String s) {
        String str = "aeiouAEIOU";
        List<Character> list = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(str.indexOf(ch) != -1 ) list.add(ch);
        }
        Collections.sort(list);
        int k=0;
        char[] chars = s.toCharArray();
        for(int i=0; i< chars.length; i++)
        {  
            char ch = chars[i];
            if(str.indexOf(ch) != -1){
                chars[i] = list.get(k);
                k++;
            }
        }
        return String.valueOf(chars);
        
    }
}