class Solution {
    public int findNthDigit(int n) {
        long digitLength = 1;
        long count = 9;
        long start = 1;

        // Find the group containing the nth digit
        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }

        // Find the number containing the nth digit
        long number = start + (n - 1) / digitLength;

        // Find the required digit
        String s = Long.toString(number);
        int index = (int) ((n - 1) % digitLength);

        return s.charAt(index) - '0';
    }
}