import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generator("", 0, 0, n, list);
        return list;
    }
    public void generator(String s, int open, int close, int n, List<String> list) {
        if (s.length() == 2 * n) {
            list.add(s);
            return;
        }

        
        if (open < n) {
            generator(s + "(", open + 1, close, n, list);
        }

        
        if (close < open) {
            generator(s + ")", open, close + 1, n, list);
        }
    }
}
