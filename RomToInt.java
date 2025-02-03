public class RomToInt {
    private static int equalNumber(char roman) {
        int value = 0;
        switch(roman){
            case 'I': 
                value = 1;
                break;
            case 'V': 
                value = 5;
                break;
            case 'X': 
                value = 10;
                break;
            case 'L': 
                value = 50;
                break;
            case 'C': 
                value = 100;
                break;
            case 'D': 
                value = 500;
                break;
            case 'M': 
                value = 1000;
                break;
        }

        return value;
    }

    public static int romanToInt(String s) {
        int sum = 0;
        for (int i = s.length(); i > -1; i--) {
            if (i < s.length() - 1 && (equalNumber(s.charAt(i)) < equalNumber(s.charAt(i + 1)))) {
                sum -= equalNumber(s.charAt(i));
                continue;
            }

            sum += equalNumber(s.charAt(i));
        }

        return sum;
    }

    public static void main(String[] args) {
        RomToInt solution = new RomToInt();
        System.out.println(romanToInt("III")); // 3
        System.out.println(romanToInt("IV")); // 4
        System.out.println(romanToInt("IX")); // 9
        System.out.println(romanToInt("LVIII")); // 58
        System.out.println(romanToInt("MCMXCIV")); // 1994
    }
}