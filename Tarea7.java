import java.util.Scanner;

public class Tarea7 {

    public static boolean esPalindromo(String s) {
        StringBuilder cadenaFiltrada = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cadenaFiltrada.append(Character.toLowerCase(c));
            }
        }

        String cadenaNormal = cadenaFiltrada.toString();
        String cadenaInvertida = cadenaFiltrada.reverse().toString();

        return cadenaNormal.equals(cadenaInvertida);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa una cadena de texto:");
        String entrada = scanner.nextLine();

        if (esPalindromo(entrada)) {
            System.out.println("Es un palíndromo válido.");
        } else {
            System.out.println("No es un palíndromo válido.");
        }
    }
}

