import java.util.HashMap;

public class tarea4 {
    
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = romanMap.get(s.charAt(i));

            if (i < s.length() - 1 && current < romanMap.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String roman1 = "III";       
        String roman2 = "IV";        
        String roman3 = "IX";        
        String roman4 = "LVIII";     
        String roman5 = "MCMXCIV";   

        System.out.println(roman1 + " => " + romanToInt(roman1));
        System.out.println(roman2 + " => " + romanToInt(roman2));
        System.out.println(roman3 + " => " + romanToInt(roman3));
        System.out.println(roman4 + " => " + romanToInt(roman4));
        System.out.println(roman5 + " => " + romanToInt(roman5));
    }
}
