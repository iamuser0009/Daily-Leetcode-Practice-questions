class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap <Character, Integer> map = new HashMap<>();
        for( int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            map.put( ch, map.getOrDefault(ch, 0)+1);
        }
        boolean [] visited = new boolean[26];
        Stack <Character> stack = new Stack<>();
        for( int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            map.put( ch , map.get(ch) -1);
            if (visited[ch - 'a']) continue;
           
            while( !stack.isEmpty() && stack.peek() >ch && map.get(stack.peek()) >0)
            {
               visited[stack.pop()-'a'] =false;

            }
            stack.push(ch);
            visited [ch-'a' ]= true;


        }
        StringBuilder sb = new StringBuilder();
        for( char ch : stack)
        {
            sb.append(ch);
        }
        return sb.toString();
        
    }
}