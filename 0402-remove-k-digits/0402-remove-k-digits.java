class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
            char digit = num.charAt(i);

            // Remove larger digits from the previous positions
            while (k > 0 && stack.length() > 0
                    && stack.charAt(stack.length() - 1) > digit) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }

            stack.append(digit);
        }

        // If removals are still remaining, remove from the end
        while (k > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }

        // Remove leading zeros
        int i = 0;
        while (i < stack.length() && stack.charAt(i) == '0') {
            i++;
        }

        String result = stack.substring(i);

        // Return "0" if the result is empty
        return result.isEmpty() ? "0" : result;
    }
}