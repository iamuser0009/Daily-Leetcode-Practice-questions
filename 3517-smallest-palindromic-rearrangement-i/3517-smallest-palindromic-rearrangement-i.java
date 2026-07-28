class Solution {
    public String smallestPalindrome(String s) {
        if (s.length() == 1)
            return s;
        int n = s.length();
        int mid = n / 2;
        String firsthalf = s.substring(0, mid );

        StringBuilder sb = new StringBuilder();

        char[] chars = firsthalf.toCharArray();
        Arrays.sort(chars);
        firsthalf = new String(chars);

        sb.append(firsthalf);
        StringBuilder reverse = new StringBuilder(firsthalf).reverse();
        if (n % 2 != 0)
            sb.append(s.charAt(mid));
        sb.append(reverse);
        return sb.toString();

    }
}