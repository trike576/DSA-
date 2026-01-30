class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int no = 0;
        boolean isNegative = false;
        // Loop to ignore leading whitespaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            isNegative = (s.charAt(i) == '-');
            i++;
        }

        // Loop to skip leading zeroes
        while (i < s.length() && s.charAt(i) == '0') {
            i++;
        }
        while (i < s.length() && (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
            int digit = s.charAt(i) - '0';
            // Check for rounding 
            if (no > Integer.MAX_VALUE / 10 || (no == Integer.MAX_VALUE / 10 && digit > 7)) {
                if (isNegative) {
                    return Integer.MIN_VALUE;
                }
                return Integer.MAX_VALUE;
            }
            no = no * 10 + digit;
            i++;
        }

        return isNegative ? no * -1 : no;
    }
}
