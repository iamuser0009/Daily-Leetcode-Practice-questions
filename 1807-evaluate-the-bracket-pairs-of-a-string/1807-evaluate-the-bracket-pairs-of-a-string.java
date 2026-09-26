class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap <String, String> map = new HashMap<>();
        for( List<String> li : knowledge){
            map.put( li.get(0), li.get(1));
        }
        StringBuilder sb = new StringBuilder();
         
        for( int i=0; i<s.length(); i++){
            if( s.charAt(i) != '(') sb.append(s.charAt(i));
            else{
                i++;
                StringBuilder sb2 = new StringBuilder();
                while(s.charAt(i) != ')' ){
                   sb2.append(s.charAt(i));
                   i++;
                }
                if(map.containsKey(sb2.toString())) sb.append(map.get(sb2.toString()));
                else{
                    sb.append('?');
                }
                //i++;
            }
        }
        return sb.toString();
        
    }
}