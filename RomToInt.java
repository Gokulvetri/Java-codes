public class RomToInt {
    // Method to return integer values of Roman numerals
    private static int getRomanValue(char roman) {
        switch (roman) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // Return 0 for invalid characters
        }
    }

    // Convert Roman numeral to integer
    public static int romanToInt(String s) {
        int sum = 0;
        int prevValue = 0;

        // Loop from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = getRomanValue(s.charAt(i));

            // Subtract if the previous value is greater
            if (currentValue < prevValue) {
                sum -= currentValue;
            } else {
                sum += currentValue;
            }

            prevValue = currentValue; // Update previous value
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III")); // 3
        System.out.println(romanToInt("IV")); // 4
        System.out.println(romanToInt("IX")); // 9
        System.out.println(romanToInt("LVIII")); // 58
        System.out.println(romanToInt("MCMXCIV")); // 1994
    }
}
