class Solution {
    public String smallestSubsequence(String s) {
         HashMap<Character, Integer> last = new HashMap<>();
        for(int i=0 ; i<s.length(); i++){
            last.put(s.charAt(i), i);
        }
        int[] presentInStack = new int[26];

        Stack<Character> stack = new Stack<>();
        for( int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

             if (presentInStack[ch - 'a'] > 0)
                continue;
            while(!stack.isEmpty() && stack.peek() > ch && last.get(stack.peek())>i )
            {   
                
               presentInStack[stack.pop()-'a'] --;
              
                
            }
         stack.push(ch);
         presentInStack[ch-'a' ]++;
         

        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
        
    }
}