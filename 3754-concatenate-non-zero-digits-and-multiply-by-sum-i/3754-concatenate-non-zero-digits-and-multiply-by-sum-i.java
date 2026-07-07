class Solution {
    public long sumAndMultiply(int n) {
        if (n == 0) return 0;

        long sum = 0;
        long x = 0;
        long multiplier = 1;

        // Process from right to left using long variables to prevent overflow
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0) {
                sum += digit;
                x = digit * multiplier + x;
                multiplier *= 10;
            }
            n /= 10;
        }

        // Return long cleanly without casting it back to int
        return x * sum;
    }
}
