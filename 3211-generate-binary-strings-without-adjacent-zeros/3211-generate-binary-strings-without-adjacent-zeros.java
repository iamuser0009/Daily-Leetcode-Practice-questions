class Solution {
    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<>();
        generator("", n, list);
        return list;

    }

    public void generator(String s, int n, List<String> list) {
        int m = s.length();
        if (s.length() == n) {
            list.add(s);
            return;
        }
        if (m == 0 || s.charAt(m - 1) == '1') {
            generator(s + "0", n, list);
            generator(s + "1", n, list);
        } else {
            generator(s + "1", n, list);
        }
    }
}