import java.util.Scanner;

public class Tarea7 {

    public static boolean esPalindromo(String s) {
        return false;  
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
