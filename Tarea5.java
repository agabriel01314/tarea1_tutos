import java.util.HashMap;
import java.util.Scanner;

public class Tarea5 {
    
    // Mapa para almacenar los valores de los símbolos romanos
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
Scanner scanner = new Scanner(System.in);

System.out.println("Introduce un número en notación romana:");
String romanInput = scanner.nextLine().toUpperCase();

int result = romanToInt(romanInput);

System.out.println("El valor en decimal de " + romanInput + " es: " + result);

scanner.close();
}
}